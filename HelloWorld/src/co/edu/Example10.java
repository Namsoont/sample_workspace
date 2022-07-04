package co.edu;

import java.util.Scanner;

public class Example10 {
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		
		boolean run = true;
		
		int balance = 0;
		
		while (run) {
			System.out.println("------------------------");
			System.out.println("1.예금, 2.출금, 3.잔고, 4.종료");
			System.out.println("------------------------");
			System.out.println("선택 >");
			
			int menuNum = Integer.parseInt(scn.nextLine());
			
			switch (menuNum) {
			case 1:
				System.out.print("예금액 > ");
				balance += Integer.parseInt(scn.nextLine());
				break;
			case 2:
				System.out.print("출금액 > ");
				balance -= Integer.parseInt(scn.nextLine());
				break;
			case 3:
				System.out.print("잔고 >");
				System.out.println(balance);
				break;
			case 4:
				run = false;
				break;
			}
			System.out.println();
		}
		
			System.out.println("프로그램 종료");
		
	}

}
