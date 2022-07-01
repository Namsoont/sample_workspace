package co.edu;

import java.util.Scanner;

public class Exmple05 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		//String name = new String("홍길동");
		System.out.println("갑을 입력.");
//		int num1 = sn.nextInt();
		System.out.println("첫번째 값을 입력.");
		int num1 = sn.nextInt();
		System.out.println("두번째 값을 입력.");
		int num2 = sn.nextInt();
		
		 
		
		
		if (num1 > num2) {
			int result = num1 - num2;
			System.out.printf("입력한 값은 %d와 %d의 차이는 %d", num1, num2, result);
		} else {
			int result = num2 - num1;
			System.out.printf("입력한 값은 %d와 %d의 차이는 %d", num2, num1, result);
		}
		
//		int result = num1 + num2;
//		System.out.printf("입력한 값은 %d와 %d의 합은 %d", num1, num2, result);
		
		
		
//		String input = sn.nextLine();// 문자열
		//정수. int input = sn.nextInt();
//		System.out.printf("입력값은 %s", input);
	}
}
