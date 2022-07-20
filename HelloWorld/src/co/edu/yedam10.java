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
		String[] data = scn.nextLine().split(" ");
		int n = Integer.parseInt(data[0]);
		int m = Integer.parseInt(data[1]);
		
		for (int j = 1; j <= m; j++) {
			System.out.println(n + " 단 : " + n + " x " + j + " = " + n * j);

		}
	}
}
