package p20220804;

import java.util.HashMap;
import java.util.Scanner;

//필드
//생성자
//메소드
public class MapApp {
	
	HashMap<String, String> map = new HashMap<>();
	Scanner scn = new Scanner(System.in);
	String  menuNo = "";
	public MapApp() {
		run();
	}
	
	private void run() {
		// menuNo = "99"
		// menuNo.equals("7") => true
		// !menuNo.equals("7") => false
		// boolean a = true 랑 같은거 
		while(!menuNo.equals("7")) {
			System.out.println("===============================================================");
			System.out.println("1. 단어등록 2. 단어 전체 조회 3. 단어 검색 4. 단어 수정 "
					+ " 5. 단어 삭제 7. 종료");
			System.out.println("===============================================================");
			System.out.println("입력 : ");
			menuNo = scn.nextLine();
			
			
			//단어 등록
			if(menuNo.equals("1")) {
				String word = "";
				while(true) {
					System.out.println("단어를 입력하세요. 종료를 원하면 q를 눌러주세요.");
					System.out.println("입력 : ");
					word = scn.nextLine();
					if(word.equals("q")) {
						break;
					}
					System.out.println("뜻 입력 : ");
					String mean = scn.nextLine();
					map.put(word, mean);
				}
			} 
			// 단어 전체 조회
			else if(menuNo.equals("2")) {
				if(map.size() == 0) {
					System.out.println("등록된 단어가 없습니다.");
					
				} else {
					System.out.println("*****단어장*****");
					//향상된 for 문을 이용해 key를 가져옴
					// 가져온 key를 활용하여 value를 가져옴
					for(String key : map.keySet()) {
						String value = map.get(key);
						System.out.println("단어 : " + key + "\n 뜻 : " + value );
						
					}
				}
			} 
			// 단어 검색
			else if(menuNo.equals("3")) {
				System.out.println("단어 입력 : ");
				String key = scn.nextLine();
				if(map.containsKey(key)) {
					String value = map.get(key);
					System.out.println("단어 : " + key + "\n 뜻 : " + value );
				} else {
					System.out.println("등록되지 않은 단어 입니다.");
				}
				
				
			} 
			//단어 수정
			else if(menuNo.equals("4")) {
				System.out.println("수정 단어 입력 : ");
				String key = scn.nextLine();
				if(map.containsKey(key)) {
					System.out.println("수정 할 뜻 : ");
					String value = scn.nextLine();
					map.put(key, value);
				} else {
					System.out.println("등록되지 않은 단어 입니다.");
				}
			} 
			// 단어 삭제
			else if(menuNo.equals("5")) {
				System.out.println("1.한건 삭제 2.전체 삭제");
				String menu = scn.nextLine();
				//한건삭제
				if(menu.equals("1")) {
					System.out.println("삭제 단어 입력 : ");
					String key = scn.nextLine();
					map.remove(key);
					if(!map.containsKey(key)) {
						System.out.println("삭제 완료!");
					} else {
						System.out.println("삭제되지 않았습니다. 관라자에게 문의하세요.");
					}
				} 
				//전체 삭제
				else if(menu.equals("2")) {
					//map에 있는 데이터 전체 삭제
					map.clear();
					if(map.size() == 0) {
						System.out.println("전체 삭제 완료!");
					} else {
						System.out.println("삭제되지 않았습니다. 관라자에게 문의하세요.");
					}
				}
			} 
			// 종료
			else if(menuNo.equals("7")) {
				System.out.println("종료 합니다.");
			}
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
