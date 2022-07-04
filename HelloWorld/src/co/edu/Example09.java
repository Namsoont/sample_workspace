package co.edu;

import java.util.Scanner;

public class Example09 {
	public static void main(String[] args) {
		// while 반목문의 종료조건.
		// 1 ~ 100 임의의 수를 생성
		  Scanner scan = new Scanner(System.in);
	      int temp = (int) ((Math.random() * 100) + 1);
	      int input = 0;
	      while (true) {
	         System.out.println("1 ~ 100 사이의 수를 적으시오.");
	         input = scan.nextInt();
	         if (input == temp) {
	            System.out.println("정답");
	            break;
	         } else if (input > temp) {
	            System.out.println("값이 큽니다.");
	         } else if (input < temp) {
	            System.out.println("값이 작습니다.");
	         }
	      }
	     
	      System.out.println("end.");
		
		
	}

}
