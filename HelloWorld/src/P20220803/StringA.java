package P20220803;

import java.util.Scanner;

public class StringA {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String a = scn.nextLine();
		String b = a.substring(0,2);
		String c = a.substring(0,6);
		System.out.println(b);
		// 6자리 - 7 자리 - > Scanner 데이터 (000000-1234567)
		// -> 나이랑, 성별 
		// -> 991212 -> 1924 ~ 2022
		
		// ->981212 -> 나이
		//->010228 -> 나이
		//->000815  -> 나이s
		
		int age1 = Integer.parseInt(b);
		int age = 0;
		if(age1 > 22) {
			age = 2022 - Integer.parseInt(b) - 1900;
			
		} else {
			age = 2022 - Integer.parseInt(b) - 2000;
		}
		System.out.println("생년월일: " + c + " 나이 : " + (age+1));
	}
}
