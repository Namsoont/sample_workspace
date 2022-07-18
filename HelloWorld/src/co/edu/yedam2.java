package co.edu;
//문제4) 아래와 같이 변수가 초기화되어있을 경우 결과값을 저장할 변수의 타입을 지정하고 값을 변수값을 출력하세요.
public class yedam2 {
	public static void main(String[] args) {
		
		byte a= 35;
		byte b= 25;
		int c = 463;
		long d = 1000L;
//		4-1
		int result = (int) ((int) a + c + d);
		System.out.println(result);
//		4-2
		int result1 = a + b + c;
		System.out.println(result1);
//		4-3
		double e = 45.31;
		double result2 = c + d + e;
		System.out.println(result2);
		
	}
}
