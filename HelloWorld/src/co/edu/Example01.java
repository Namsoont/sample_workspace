package co.edu;

public class Example01 {
	public static void main(String[] args) {
		boolean isTrue = false;
		
		int myAge = 10;
		int yourAge = 11;
		myAge =13;
		
		isTrue = myAge > yourAge;
		if (isTrue) {
		
		System.out.println("나의 나이가 더 많다.");
		} else {
		System.out.println("나의 나이가 더 적다.");
	
		// float, double : double default.
		float f1 = 23.4f; //4byte
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		double d1 = 23.4; //8byte
		
		// 0 ~ 100 정수.
		// 0 ~ 1 실수.
		double result = 1.1 + 2.2;
		System.out.println(result);
		
		//lonf(8)  float(4)
		float sum = 2345L + 22.3F;
		}
		
	}
}
