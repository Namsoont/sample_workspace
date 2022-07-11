package P20220711;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchEx {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		
		
		try {
			int num = scn.nextInt(); //정수값 입력 = > 문자입력이들어옴
			System.out.println("입력값 " + num);
		} catch (InputMismatchException e) { //잘못입력된예
			System.out.println("잘못된 값 입력 됨");
		}
		
		
		System.out.println("프로그램 종료");
	}
}
