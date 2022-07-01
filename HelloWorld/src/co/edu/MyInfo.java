package co.edu;

public class MyInfo {
	public static void main(String[] args) {
		String name = "남순탁";
		int myAge = 31;
		double height = 178.9;
		
		name = "남순탁";
		myAge = 30;
		height = 180.3;
		
		System.out.println("이름은 " + name + "이고, 나이는 " + myAge + "이고, 키는 " + height + " 입니다" );
		
		double myh = 178.7;
		double fh = 179.1;
		
		double theDifference = 0;
		
		if  (myh > fh) {
			theDifference = myh - fh;
			System.out.println("나의 키가 " + theDifference + "만큼 더 큽니다.");
		} else {
			theDifference = fh - myh;
			System.out.println("나의 키가 " + theDifference + "더 작습니다.");
			
		}
				
			
	}
}
