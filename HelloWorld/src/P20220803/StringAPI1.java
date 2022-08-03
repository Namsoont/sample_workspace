package P20220803;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StringAPI1 {
	public static void main(String[] args) {
		//1. 단어 입력
		//2. 대, 소문자 변환
		//3. 단어의 총 길이
		//4. 단어 자르기
		//5. 단어 자르기2
		Scanner scn = new Scanner(System.in);
		
		int MenuNo = 0;
		List<String> list = new ArrayList<>();
		
		while(MenuNo != 99){
			
		
		
		System.out.println("기능을 선택해 주세요.");
		System.out.println("1. 단어입력 2. 대,소문자 변환 3. 단어 길이 4. 단어 자르기 5. 단어 자르기2"
				+ " 99. 프로그램 종료");
		
		System.out.println("입력>");
		//->netLine = String + Enter
		//->Enter
		//->next() = > 5 + Enter
		// int = nextInt()	 => 5 + Enter
		// int = nextLine()	=> Enter
		
		
		MenuNo = Integer.parseInt(scn.nextLine());
		switch(MenuNo) {
		case 1:
			while(true) {
			System.out.println("단어를 입력세요. 종료를원하면 q를 눌려주세요.");	
			String word = scn.nextLine();
			if(word.equals("q")) {
				break;
			}
			list.add(word);
			}
			for(String str : list) {
				System.out.println(str + " ");
			}
			break;
		case 2:
			if(list == null || list.size()==0) {
				System.out.println("단어가 등록되지 않았습니다.");
				return;
			}
			
			System.out.println("1. 대문자 2. 소문자");
			int menu = Integer.parseInt(scn.nextLine());
			if(menu == 1 ) {
				for(String str : list) {
					System.out.println(str.toUpperCase() + " ");
				}
			}else if(menu == 2) {
				for(String str : list) {
					System.out.println(str.toLowerCase() + " ");
			}
				
			}
			break;
		case 3:
			StringBuilder sb = new StringBuilder();
			
			for(int i = 0; i < list.size(); i++) {
				sb.append(list.get(i));
			}
			
			System.out.println("입력한 문자의 총 길이 : " + sb.length() + "입니다.");
			break;
		case 4: 
			System.out.println("자르고 싶은 단어의 인덱스를 입력하세요.");
			int i = 0;
			for(String str : list) {
				System.out.println(i + "번째 단어 : " + str);
				i++;
			}
			System.out.println("입력>");
			int idx = Integer.parseInt(scn.nextLine());
			
			String word = list.get(idx);
			// 안더 가운데부터 끝 자르기
			// String.substring(숫자)
			//word.substring(Math.round(word.length()/2))
			
			//1. word.length()/2 가운데
			//2. Math.round() 소수점없애고 반올림
			//Math.round(word.length()/2) -> 단어의 한 가운데의 인덱스
			//3.word.substring(단어의 한 가운데 인덱스) -> 단어의 가운데부터 끝까지
			
			System.out.println(word.substring(Math.round(word.length()/2)));
			
			
			break;
		case 5:
			System.out.println("단어 입력 >");
			String str = scn.nextLine();
			
			System.out.println("입력하신 단어 : " + str);
			System.out.println("구분자 입력 >");
			String splits = scn.nextLine();
			String[]token = str.split(splits);
			for(String str2 : token) {
				System.out.println(str2);
			}
			
			//split() 문자열을 잘라줌 / , * $ # 
			break;
		}
		}
	}
}
