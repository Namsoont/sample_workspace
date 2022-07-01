package co.edu;

public class HelloWorld {
	public static void main(String[] args) {
		// 변수의 종류: int(정수), double(실수), boolean(논리값), string(문자열), my_agg, 단어조합이면후단어첫대문자
		//heignt(실수) myAge(정수), double result1 = (double) myAge + heignt
		//int(4byte) < double(byte)
		//정수:byte(1) < short(2byte) < int(4byte) < long(8byte)
		//
		String name = "남순탁";
		
		int myAge = 20; // 선언하면서 값을 할당 => 초기화. int yourage;<-선언 :초기화(X),int result myAge + yourAge;<변수사용을위해서값
		double height = 162.4;
		boolean isMarried = true;
		String myAddress = "대구시";
		
		myAge = 30;
		height = 165.2;
		
		int result = myAge + 1;
	    double result1 = myAge + height; // myAge는 자동으로 정수를 실수로 바꿔주지만 result는 자동으로 바뀌지 않기에 double result1으로 변경
		System.out.println(result);
		
		System.out.println("안녕하세요 " + name + " 입니다.");
	}
}
