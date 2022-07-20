package co.edu;

import java.util.Scanner;

public class yedam7 {
	public static void main(String[] args) {
		// 문제2) 연도가 주어졌을 때 해당 년도가 윤년인지를 확인해서 출력하도록 하세요.
				// 윤년은 연도가 4의 배수이면서 100의 배수가 아닐 때 또는 400의 배수일때입니다.
				// 예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이며,
				// 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아닙니다.
				// HiNT : 이중 IF문 사용
				int a;
				int b;
				Scanner scn = new Scanner(System.in);
				a = scn.nextInt();
				if(a % 4 == 0 && a % 100 != 0 || a%400 == 0) {
					b = 1;
				} else {
					b = 0;
				}
				System.out.println(b);
	}
}