package co.edu;

public class yedam9 {
	public static void main(String[] args) {
		// 문제4) for문과 "*"를 이용하여 아래와 같이 출력하도록 하세요.
				// *
				// **
				// ***
				// **** 
				// *****
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
}
}