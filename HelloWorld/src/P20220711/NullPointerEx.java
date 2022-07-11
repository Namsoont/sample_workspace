package P20220711;
/*
 * 인스턴스 참조변수 = null
 */
public class NullPointerEx {
	public static void main(String[] args) {
		
		String name = "홍길동";
		name = null;
		
		
		try {
			System.out.println(name.toString());
			
			System.out.println("name 을 출력." );
		} catch (NullPointerException e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램종료");
		
		
}
}