package co.edu;

import java.util.Scanner;

public class Example07 {
	public static void main(String[] aras) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 수:");
		String strNum1 = scanner.nextLine();
		System.out.print("두번째 수:");
		String strNum2 = scanner.nextLine();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("덧샘 결과:" + result);
	}
}