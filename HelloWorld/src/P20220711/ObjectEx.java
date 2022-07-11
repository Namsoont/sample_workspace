package P20220711;

class Member  {
	String id;
	int age;
	@Override // equals 컨트롤+스페이스바
	public boolean equals(Object obj) {
		
		if(obj instanceof Member) {
		boolean b1 = this.id.equals(((Member) obj).id);
		boolean b2 = this.age == ((Member) obj).age;
		return b1 && b2;
		}
				
		return false;
	}

@Override
public String toString() {
	
	return "아이디: " + id + ", 나이: " + age;
}
}


public class ObjectEx {
	public static void main(String[] args) {
		
		
		Object obj1 = new Object(); //instance => 주소값.
		Object obj2 = new Object(); //instance => 주소값.
		
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.toString()); //Object.toString() <= 주소값을 찍어줌. 
		
		String name1 = new String("홍길동");
		String name2 = new String("김길동");
		
		System.out.println(name1.equals(name2)); //equals <- 값을 비교.
		System.out.println(name1.toString()); // 문자를찍어줌
		
		Member member1 = new Member();
		member1.id = "user1";
		member1.age = 10;
		
		Member member2 = new Member();
		member2.id = "user1";
		member2.age = 10;
		
		System.out.println(member1.equals(member2)); //물리적 다른 객체. 논리적 동일한객체.
		System.out.println(member1.toString()); // Object.toString()으로 찍어줌.
		
	}
}
