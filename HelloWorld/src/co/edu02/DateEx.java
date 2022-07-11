package co.edu02;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/*
 * Date, Calendar => 시간,날짜 정보.
 */
public class DateEx {
	public static void main(String[] args) {
	 Date today = new Date(); // Date 대신에 나온게 LocalDate, LocaDateTime
	 today.getDate(); 
	 today.getDay();
	 
	 System.out.println(today.toString());
	 System.out.println(today.toGMTString());
	 System.out.println(today.toLocaleString());
	 
	 //2022년 07월 12일 14시 53분12초.
	 
	 SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초"); //대문자 HH 24시기준.
	 System.out.println(sdf.format(today));
	 
	 sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	 System.out.println(sdf.format(today));
	 
	 today = new Date("2022/07/11 17:50:00");
	 System.out.println(sdf.format(today));
	 System.out.println("=======================================");
//	 Calendar 클래스
	 Calendar now = Calendar.getInstance();
	 System.out.println(now.get(Calendar.YEAR) + "년"); 
	 int mom = now.get(Calendar.MARCH);
	 
	 now.set(2022, 10, 11);
	 System.out.println(now.get(Calendar.DATE) + "일");
	 System.out.println("=======================================");
	 //LoCalDate
	 
	 LocalDate lDate = LocalDate.now(); //정적 메소드.
	 System.out.println(lDate.toString());
	 System.out.println("=======================================");
	 
	 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년MM월dd일");
	 System.out.println(lDate.format(dtf));
	 
	 
	}
}
