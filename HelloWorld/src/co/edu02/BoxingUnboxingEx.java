package co.edu02;

import java.util.HashSet;

public class BoxingUnboxingEx {
	public static void main(String[] args) {
		// 로또번호 생성. 1 ~ 45
		int[] lotto = new int[6];
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) +1;
			
			for (int j=0; j < i; j++) { //현재 값과 동일한 값이 있는 지 체크.
				
			}
		}
		for(int num : lotto) {
			System.out.println(num);
		}
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		int cnt = set.size(); // 1,2,3,3 => 3
		while(set.size() < 6 ) {
		int i = (int) (Math.random() * 45) + 1;
		set.add(i);
		System.out.println(set.size()+ "번쨰숫자: " + i);
			}
		
		
		
	}
	
}
