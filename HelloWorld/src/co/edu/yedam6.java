package co.edu;

import java.util.Scanner;

public class yedam6 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// 문제1) 차례대로 x와 y의 값이 주어졌을 때 어느 사분면에 해당되는지 출력하도록 구현하세요.
		// 각 사분면에 해당 하는 x와 y의 값은 아래를 참조하세요.
		// 제1사분면 : x>0, y>0
		// 제2사분면 : x<0, y>0
		// 제3사분면 : x<0, y<0
		// 제4사분면 : x>0, y<0
		
		int X = scn.nextInt();
		int Y = scn.nextInt();
		
		if (X > 0 && Y > 0) {
			System.out.println("1사분면");
		}else if (X < 0 && Y > 0) {
			System.out.println("2사분면");
		}else if (X < 0 && Y < 0) {
			System.out.println("3사분면");
		}else if (X > 0 && Y < 0) {
			System.out.println("4사분면");
		}
		
	}
}
