package P20220707;
// 메소드 연습용.
// 입력값(매개변수) 출력값(반환값)

// static 정적메소드, 정적필드 사용.

public class StaticMain {
	public static void main(String[] args) {
		//정적(static) 기능.
//		Calculator cal = new Calculator();
//		System.out.println(cal.pi);
//		
//		System.out.println(Calculator.pi);
		int result = Calculator.sum(10, 20);
		
//		Math.random();
		
		Singleton sing1 = Singleton.getInstance();
		Singleton sing2 = Singleton.getInstance();
		
		System.out.println(sing1 == sing2);
	}

}
