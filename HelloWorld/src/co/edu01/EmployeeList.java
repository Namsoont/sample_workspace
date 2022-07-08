package co.edu01;

import java.util.Calendar;
import java.util.Scanner;

public class EmployeeList {
	// 싱글톤.
	private static EmployeeList instance = new EmployeeList();
	Calendar cal = Calendar.getInstance();
	private EmployeeList() {

	}

	public static EmployeeList getInstance() {
		return instance;
	}

	// 배열
	Employee[] list; // 사원 배열.
	int empNum; // 사원 수.
	Scanner scn = new Scanner(System.in);

	// 리스트 초기화.
//	private EmployeeList(Employee[] list) {
//		this.list =list;
//		this.empNum = list.length;
//	}

	// 배열객체 선언.
	public void init() {
		System.out.print("사원수 입력> ");
		int num = Integer.parseInt(scn.nextLine());
		list = new Employee[num];

	}

	// 사원정보 입력 -> 배열추가.
	public void input() {
		if (empNum >= list.length) {
			System.out.println("입력초과");
			return; // 메소드 종료
		}
		System.out.printf("%d 사번> ", empNum);
		int no = Integer.parseInt(scn.nextLine()); // no = 사원

		System.out.printf("이름> ");
		String name = scn.nextLine();

		System.out.printf("급여 > ");
		int sal = Integer.parseInt(scn.nextLine());

		list[empNum++] = new Employee(no, name, sal); // 사원인스턴스. ->배열저장. //empNum++ <--필드값

	}

	// 전체출력.
	public void printList() {
		for (int i = 0; i < empNum; i++) {
			System.out.printf("%5d %10s %7d\n", list[i].getEmpaloyeeId(), list[i].getName(), list[i].getSalary());
		}
	}

	// 상세조회. 사원에 상세 정보를 보여주는 기능 EmPloyee추가.
	public void search() {
		System.out.printf("사원번호를 입력>");
		int employeeId = Integer.parseInt(scn.nextLine());

		for (int i = 0; i < empNum; i++) {
			if (employeeId == list[i].getEmpaloyeeId()) {
				System.out.println(list[i].getDetailInfo());
				break;
			} else if (i == empNum - 1) {
				System.out.println("잘못된 정보입니다.");

			}
		}
		
	}
public int getLastDate(int year, int month) {
		
		cal.set(year, month -1 , 1);
		return cal.getActualMaximum(Calendar.DATE);
		
		
							
	}
public int getDayInfo(int year, int month) {
	
	cal.set(year, month -1 , 1);
	return cal.get(Calendar.DAY_OF_WEEK);
}


//	private int getLastDate(int mon) {
//		switch(mon)	{
//		 case 1 :
//	         return 31;
//	      case 2:
//	         return 28;
//	      case 3 :
//	         return 31;
//	      case 5 :
//	         return 31;
//	      case 7 :
//	         return 31;
//	      case 8 :
//	         return 31;
//	      case 10 :
//	         return 31;
//	      case 12 :
//	         return 31;
//	      default:
//	         return 30;
//
//		}
//	}
//	//1일의 요일정보.
//	private int getDayInfo(int mon) {
//		switch(mon) {
//		 case 1 :
//	         return 6;
//	      case 2: 
//	         return 2;
//	      case 3 :
//	         return 2;
//	      case 4 :
//	         return 5;
//	      case 6 :
//	         return 3; // 첫째날 요일정보
//	      case 7 :
//	         return 5;
//	      case 8 :
//	         return 1;
//	      case 9 :
//	         return 4;
//	      case 10 :
//	         return 6;
//	      case 11 :
//	         return 2;
//	      case 12 :
//	         return 4;
//	      default:
//	         return 0;
//
//		}
//		
//	}
	//달력
	public void showCalendar() {
		System.out.println("연도를 입력 >>");
		int year = Integer.parseInt(scn.nextLine());
		
		System.out.println("월을 입력>>");
		int month = Integer.parseInt(scn.nextLine());
		
		
		//요일정보, 1일의 위치. 말일의 날짜.
		String[] days = {"Sun", "Mon", "tue", "wed", "thr", "fri", "sat"};
		int firstDay = getDayInfo(year, month); //일0, 월:1 , 화:2 ,수:3, 목:4, 금:5 토:6
		int lastDate = getLastDate(year, month);
		
		for(int i = 0; i < days.length; i++) {
			System.out.printf("%4s", days[i]);
		} 
		 System.out.println();
		 //1일의 요일정보를 마추도록.
		 for (int i = 1; i < firstDay; i++) {
			 System.out.printf("%4s", " ");
		 }
		for(int i = 1; i <= lastDate; i++) {
			System.out.printf("%4s", i);
			if((i+firstDay-1) % 7 == 0 ) { //토요일까지 출력후 줄 바꿈
				System.out.println();
			}
		}
		System.out.println("\n프로그램 종료.");
		System.out.println();
	}
	
}
