package P20220707;

import java.util.Calendar;
import java.util.Scanner;

/*
 * Calendar 클래스 연습.
 */
public class CalendarExample {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); 
		System.out.println(cal.get(Calendar.YEAR) + "년");
		System.out.println(cal.get(Calendar.MONTH)+1 + "월");  // 0 ~ 11 
		System.out.println(cal.get(Calendar.DATE) + "일");
		System.out.println(cal.get(Calendar.DAY_OF_WEEK) + "요일"); // 1(일) ~ 7 (토)
		System.out.println(cal.getActualMaximum(Calendar.DATE) + "일"); // 말일날짜
		
		cal.set(2022, 5, 1); // 2022년 6월 1일 지정
		System.out.println(cal.get(Calendar.YEAR) + "년");
		System.out.println(cal.get(Calendar.MONTH)+1 + "월");  // 0 ~ 11 
		System.out.println(cal.get(Calendar.DATE) + "일");
		System.out.println(cal.get(Calendar.DAY_OF_WEEK) + "요일"); // 1(일) ~ 7 (토)
		System.out.println(cal.getActualMaximum(Calendar.DATE) + "일"); // 말일날짜
		
	}
	
//	// 년년, 월 정보 => 해당 년, 월의 요일정보(메소드) 2022년 9월달 => 30
//	public int getLastDate(int year, int month) {
//		
//		cal.set(year, month -1 , 1);
//		return cal.getActualMaximum(Calendar.DATE);
//		
//		
//							
//	}
//	
//	// 년, 월 정보 => 해당 년, 월의 말일정보(메소드) 2022년 9월달 => 5요일
//	int year = 2022;
//	int month = 30;
//	int day = 8;
//	public int getDayInfo(int year, int month) {
//		
//		cal.set(year, month -1 , 1);
//		return cal.getActualMaximum(Calendar.DAY_OF_WEEK);
	}
	
//}
