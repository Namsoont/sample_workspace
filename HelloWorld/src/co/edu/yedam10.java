package co.edu;
//문제5) 차례대로 m과 n을 입력받아 m단을 n번째까지 출력하도록 하세요.
		// 예를 들어 2와 3을 입력받았을 경우 아래처럼 출력합니다.
		// 2 X 1 = 2
		// 2 X 2 = 4
		// 2 X 3 = 6
import java.util.Scanner;

public class yedam10 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); 
		System.out.println("단 : ");
		int a = scn.nextInt();
		System.out.println("수 : ");
		int b = scn.nextInt();
		for (int i = 1; i <= b; i++) {
			System.out.printf(a + " x " + i + " = " + (a*i));
			System.out.println();


		}
	}
}
