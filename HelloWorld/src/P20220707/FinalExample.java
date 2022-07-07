package P20220707;
/*
 * 상수 vs. 변수
 */
/*  변수에 final이 붙으면 상수.  메소드에 final이 붙으면 재 정의 할수 없다.(overriding)불가
 * 클래스 선언은 파일 하나만 하는게좋음 나중에 찾기 힘듬. (하나 작성이 원칙.)
 */
//클래스에 final이 붙이면 상속이 불가.
class Person {
	final String ssn;
	String name; // 주민번호.
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
public class FinalExample {	public static void main(String[] args) {
		
		//변수.
		String name = "홍길동";
		name = "김민수";
		
		
		//상수. (바꿀수없다) = final <-마지막이라는것, 쓰면 더 이상 입력 못함.
		final int num = 10;
//		
		
		Person person = new Person("920101- 1234567", "홍길동");
		person.name = "홍민수";
//		person.ssn = "930101-1234567"; final 선언해서 더이상 바꿀수없어서 안됨.
		
		
		
		
	}
}
