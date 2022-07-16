package co.edu;

/* 문제1) 정수형 변수 2개를 선언 후 각각 37과 91로 값을 초기화 후 변수를 출력하라. 
출력예시) "변수명1: 변수값, 변수명2: 변수값" */
public class yedam0 {
//각각 37과 91로 값을 초기화 
	public static void main(String[] args) {
//		문제1) 정수형 변수 2개를 선언 후 각각 37과 91로 값을 초기화 후 변수를 출력하라.
		int a = 37, b = 91;
		double result = 0;
		System.out.printf("a: %d, b: %d\n", a, b);
		
		
		
//		문제2) 문제 1번의 변수를 이용하여 각 연산을 수행한 결과를 출력하라.
		
		result = b + a;
		System.out.println("더하기: " + result);
		
		
		result = b - a;
		System.out.println("빼기: " + result);
		
		
		result = b * a;
		System.out.println("곱하기: " + result);
		
		
		result = (double) b / a;
		System.out.println("나누기: " + result);
		
	}
}
