package P20220803;

import java.util.Scanner;


public class Lotto {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] lotto = null;
		boolean run = true;
		int money = 0;
		
		
		while(run) {
		System.out.println("--------------------------");
		System.out.println("1.금액 | 2. 출력 | 3. 종료");
		System.out.println("--------------------------");
		int selectNo = Integer.parseInt(scn.nextLine());
		switch(selectNo) {
		case 1: 
			System.out.println("금액> ");
			money = Integer.parseInt(scn.nextLine());
			
			
			for (int i = 0; i < money/10000; i++) {
			for (int j = 0; j < lotto.length; j++) {
			lotto[i] = (int)(Math.random()*45)+1;
			for(int a = 0; a < 6; a++ ) {
				
			}		
				}
		}
		
		
		}
		
		}
		
		
		}
		
}

