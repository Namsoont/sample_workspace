package co.edu;

import java.util.Scanner;

public class BankAccount {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// 1.입금, 2.출금, 3.잔액조회, 4.종료
		
		int valance = 0;
		
		while(true) {
			System.out.println("1.입금. 2.출금. 3.잔액조회. 4.종료.");
			int menu = scn.nextInt();
			if(menu == 1) { 
				System.out.println("금액을 입력하세요.");
				int amt = scn.nextInt();
				valance += amt;
				if(100000 <= valance) {
				valance -= amt;
				System.out.println("100000원 이상 입금 불가.");
				continue;
				// if(amt<0) {
				// System.out.println("입금액은 0보다 커야합니다.");
				// continue
				}else {
				System.out.println("정상적으로 처리완료.");
				}
				
				
				
			} else if (menu == 2) {
				System.out.println("금액을 입력하세요.");
				int amt = scn.nextInt();
				if(valance > amt) {
					valance -= amt;
					System.out.println("정상적으로 출금 완료. ");
				} else {
				
					System.out.println("잔액이 부족합니다.");
				}
			
				
			} else if (menu == 3) {
				System.out.println("현재 잔액은: " + valance);
				
			} else if (menu == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
				
			} else {
				System.out.println("잘못된 메뉴를 입력했습니다.");
				
			}
		} // end of while
		
		
		
	}

}



