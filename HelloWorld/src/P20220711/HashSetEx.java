package P20220711;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class HashSetEx {
	public static void main(String[] args) {
		// 데이터 저장 => 배열. Index기반.
		// 컬렉션 ArrayList <=동일한값을 저장.  동일한 값 다른 인덱스.
		// 컬렉션 HashSet <= 동일한 값을 받지않음. 인덱스 값 지정(X), 동일한 값 지정(X)
		
		HashSet<String> set = new HashSet<String>();
		set.add("홍길동");
		set.add("김길동");
		set.add("홍길동");
		
		
		
		System.out.println(set.size());  //중복된값 set
		Iterator<String>iter = set.iterator();
		while (iter.hasNext()) { //haNext:컬렉션에서 가지고 올 요소 체크.
			System.out.println(iter.next()); // next: 요소 선택.
		}		
				
		
		
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("김길동");
		list.add("홍길동");
		
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
