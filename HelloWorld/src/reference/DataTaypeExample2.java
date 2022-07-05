package reference;

public class DataTaypeExample2 {
	public static void main(String[] args) {
		 기본 데이터 타입. (btet,short,long,int,float,double,boolen)
		int num1 = 100;
		int num2 = 100;
		
		System.out.println(num1 == num2);
		
	   참조 데이터 타입.
		//String str1 = new String("홍길동");  // 홍길동 객체 주소값.
		String str2 = new String("홍길동");  // (새로운) 홍길동 객체 주소값.
		System.out.println(str1 == str2);  // 변수의 주소 비교.
		System.out.println(str1.equals(str2)); // 값을 비교.
		
		int result = 0;
		str1 = null; //null 초기화
		System.out.println(str1.equals(str2)); //값을 비교.
		
		
		
	}
}
