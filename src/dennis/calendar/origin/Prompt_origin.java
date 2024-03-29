package dennis.calendar.origin;

import java.util.Scanner;

public class Prompt_origin {
	
	public int parseDay(String week)	{
		if(week.equals("SU")) {
			return 0;
		}
		else if(week.equals("MO")) {
			return 1;
		}
		else if(week.equals("TU")) {
			return 2;
		}
		else if(week.equals("WE")) {
			return 3;
		}
		else if(week.equals("TH")) {
			return 4;
		}
		else if(week.equals("FR")) {
			return 5;
		}
		else if(week.equals("SA")) {
			return 6;
		}
		else
			return 0;
	}
	
	public void runPrompt() {
		Scanner sc = new Scanner(System.in);
		Calendar_origin cal = new Calendar_origin();
		
		int month = 1;
		int year = 2020;
		int weekday = 0;
		
		while(true) {
			System.out.println("년도를 입력하세요(exit : -1).");
			System.out.print("YEAR> ");
			year = sc.nextInt();
			if(year == -1) {
				break;
			}
			System.out.println("달을 입력하세요.");
			System.out.print("MONTH> ");
			month = sc.nextInt();
			System.out.println("첫째 날의 요일을 입력하세요(SU MO TU WE TH FR SA).");
			String str_weekday = sc.next();
			weekday = parseDay(str_weekday);
			
			if(month > 12 || month < 1) {
				System.err.println("잘못된 입력입니다.");
				continue;
			}
			
			cal.printCalendar(year, month, weekday);
			System.out.println();
		}
		
		System.out.println("Bye~");
		sc.close();
	}
	
	public static void main(String[] args) {
		
		// 셀 실행
		Prompt_origin p = new Prompt_origin();
		p.runPrompt();
			

	}
	
	public void test_test() {}

}
