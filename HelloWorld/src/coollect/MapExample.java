package coollect;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
 * 이름, 점수 = map저장.
 * 김민수=80/ 황현익=75 / 이현승=88
 * Scanner 클래스 입력 > 학생이름 입력받아서 점수를 반환.
 */
public class MapExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		Map<String, Integer> a = new HashMap<String, Integer>();
		a.put("김민수", 80);
		a.put("황현익", 75);
		a.put("이현승", 88);
		
		//출력 결과:
		//평균 점수:
		//최고 점수:
		System.out.println("이름: ");
		String name = scn.nextLine();

		Set<Entry<String, Integer>> set = a.entrySet();

		boolean yes = false;
		for (Entry<String, Integer> ent : set) {
			if (ent.getKey().equals(name)) {
				yes = true;
				System.out.println("점수: " + ent.getValue());
				break;
			}
		}
		if (!yes) {
			System.out.println("찾는학생이 없습니다.");

		}
		int avg = 0;
		int sum = 0;
		String no1 = " ";
		int max= 0;
		
		
		for (Entry<String, Integer > ent : set) {
			String key = ent.getKey();
			Integer val = ent.getValue();	
			sum += val;			
			if(val>max) {
				max=val;
				no1=key;
			}
				
			System.out.println("평균값:" + sum/ a.size() );
			System.out.println("최대값:" + max + "이름: " + no1);
			
				
			
		
		
		 
	
	


}
}
}