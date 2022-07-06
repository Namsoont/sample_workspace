package reference;

public class MethodExample01 {
	public static void main(String[] args) {
		//실행구문
		long sum = sum(20);  //arguments(매개 값)
		showInfo(" 장마다", 100);	
		showInfo(" 비좀그만와라!",7);
		peinStar(5, "☆");
		for (int i = 2; i <= 9; i++)
		printGugudan(i);
		
	}
	public static void	peinStar(int times, String shape ) {
		//int sum = 0;
		 for (int i = 1; i <= times; i++) {
				for (int j = 1; j <= i; j++) {
					
			System.out.print(shape);
			
				}
				System.out.println();
		 }
		 
		 
			 
		 }
		 
	
	
	public static void showInfo(String name, int age) {
		System.out.println("안녕하세요." + name + "입니다. 나이는 " + age + "살 입니다.");
	}
	
	//정의구문
	public static long sum(int num) { //parameter (매개변수)
		int result = num * 2;
		return result;  //자동형변환(promotion)
		
	}
	
	public static void printGugudan(int a) {
		for (int i = 1; i <=9; i++) {
		System.out.printf("%d * %d = %d\t", a , i, (a * i)); //a + "단 : " + a * i , "%d * %d = %d\n", a , i, (a * i)
		
		}
		System.out.println();

	
}
	}