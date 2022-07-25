package co.edu;

import java.util.Scanner;

public class yedam13 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = 0;
		boolean run = true;
		
		int[] b = null;
		
		while(run) {
			
			System.out.println("--------------------------------------------");
			System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.println("선택> ");
			int s = Integer.parseInt(scn.nextLine());
			
			switch(s) {
			case 1:
				System.out.println("상품수 :");
				a = Integer.parseInt(scn.nextLine());
				b = new int[a];
				break;
			case 2:
				for(int i = 0; i < a; i++) {
					
				}
					
				}
			}
			
		}
		
		
		
	}
}
