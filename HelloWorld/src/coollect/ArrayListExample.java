package coollect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
//		ArrayList<String> list;
		ArrayList<String> list = new ArrayList<String>();
		list.add("사과");
//		list.add(100);
		
		for (int i = 0; i < list.size(); i++) {
			String result = (String) list.get(i);
			System.out.println(result);
			System.out.println("======================================");
		}
		//List 컬렉션. List(인터페이스) => ArrayList, LinkList, Vector
		List<String> sList = new ArrayList<String>();
		sList.add("홍길동");
		sList.add("김민기");
		String result = sList.get(1); //값을 읽어올때.
		sList.remove(0); //값을 삭제.
		sList.set(0, "홍길동");
		
		Iterator<String> iter = sList.iterator(); //반복자 생성.
		while(iter.hasNext()) { //요소의 존재여부를 체크
			String val = iter.next(); //요소를 가지고 오는 메소드.
			System.out.println(val);
			System.out.println("======================================");
					
		}
		//index 기반으로 요소 저장.
		for(int i = 0; i < sList.size(); i++) {
			System.out.println(sList.get(i));
			System.out.println("======================================");
		}
		//확장 for구문.
		for(String val : sList) {
			System.out.println(val);
		}
		
	}
}
