package reference;

import java.util.Scanner;

public class ForExample02 {
	//메소드 정의구문.
	public static int sumAry(int[] num) {
		//return num * 2;
		int sum = 0;
		for(int i = 0; i <num.length; i++) {
			sum += num[i];
			
		}
			return sum; //메소드를 호출한 영역으로 sum의 값을 변환.
		
	}
	public static void main(String[] args) {
		//메소드 호출구문 (int)
		//int result = sumAry(10);
		//result =sumAry(20);
		//System.out.println("결과값: " + result);
		
		
		//배열 합계
		int sum = 0;
		double avg = 0;
		
		int[] intAry = {34,23,56,22,99,28};
		//intAry 배열의 합과 평균
		//sum =sumAry(intAry);
		int[] intArray = new int[6];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = (int) (Math.random() * 100) + 1;
			sum += intArray[i];
			avg = (double)sum / intArray.length;
			
		} System.out.println("배열의 합 : " + sum + "\n평균: " + avg);
		// intArray 합과 평균
		int sum1 = 0;
		double avg1 = 0;
		int[] scanArray = new int[5];
		Scanner scn = new Scanner(System.in);
		for (int i = 0; i < scanArray.length; i++) {
			System.out.println("임의의 수를 입력>>>>>");
			scanArray[i] = scn.nextInt();
			sum1 += scanArray[i];
			avg1 =(double)sum1 / scanArray.length;
		}
		System.out.println("임의의 수 합" + sum1 + "평균: " + avg1);
	}

}
