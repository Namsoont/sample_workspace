package co.edu;

import java.util.Scanner;

public class test {
	
		public static void main(String[] args) {
			//문자열로도 printf로 문자열 표시
		
			
			Scanner test = new Scanner(System.in); //스캐너 선언(유저 또는 본인이 칠 값을 입력 하기 위한 선언 
			System.out.println("입력");
			System.out.println("첫번째 값 입력");
			String test01 = test.next(); // .next(); 문자열을 담기위한 메소드 <  
			
			System.out.println("두번째도 입력해줭~ㅋㅋ");
			String test02 = test.next();
			
			String result = test01 + test02; // 합친 결과
			System.out.println(result); 
			System.out.printf("붙인 결과다 십새야 = %s" , result );
		} 
}


