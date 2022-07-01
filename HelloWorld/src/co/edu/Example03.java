package co.edu;


public class Example03 {
public static void main(String[] args) {
	// 10+20 => 30, "10"+"20" => "1020" <""문장
	System.out.println(10 + 20);
	System.out.println("10" + "20");
	//String 홍길동 = "hong";
	//내 이름은 "홍길동" 입니다 t<텝(띄우기) n(줄바꿔서나오는\"홍길동\")
	System.out.println("내 이름은 \"홍길동\" 입니다");
	//{"name":"홍길동", "age":20 } json데이터타입.
	System.out.println("{\"name\":\"홍길동\", \"age\": 20}");
	// 문자열 -> 정수, 실수.
	int num1 = Integer.parseInt("100"); // "100" -> 100
	double num2 = Double.parseDouble("127.99");
	double num3 = Double.parseDouble("122.1");
	//sum(정수타입) 반환타입없으면 void(안하겠으면)
	int result = sum(10, 12);
	double result1 = sum(num1, num2);
	double result2 = minus(num2, num3);
	System.out.println("합결과: " + result);
	System.out.printf("차이는 %.2f 입니다\n", result1);
	
	System.out.printf("저의 이름은 %s이고 나이는 %d 입니다.\n", "홍길동", 14);
	// 정수는 %d 실수는%f 
	String name = "남순탁";
	int age = 31;
	double a = 65.4;
	
	System.out.printf("나의 이름은 %s이고\n나이는 %d 이고\n몸무게는 %.1f 입니다.", name, age, a);
	
}

//2개의 숫자를 합한 결과를 변환. method.
public static int sum(int num1, int num2) {
	int sum = num1 + num2;
	return sum;
   }

public static double sum(int n1, double n2) {
	double sum = n1 + n2;
	return sum;

}

public static double minus(double n1, double n2) {
	double sum = n1 - n2;
	return sum;

}

// 이름, 나이, 몸무게 => 3개변수선언.
// 나의 이름은 홍길동이고
// 나이는 16이고
// 몸무게는 65.4 입니다.


	
			
   
   }

