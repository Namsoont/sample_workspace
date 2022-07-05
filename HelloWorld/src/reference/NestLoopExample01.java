package reference;

public class NestLoopExample01 {
	public static void main(String[] args) {
		
	for(int j = 1; j <=3; j++) {
//		System.out.println("j 의 값 : " + j);
		for(int i = 1; i <= 5; i++) {
//			System.out.println("i 의 값: " + i);
	}
		
	
	}
		
	
		for (int j=2; j<=9; j++) {
			
		for(int i=1; i<=9; i++) {
//		System.out.printf("%d * %d = %d \n", j, i, (j * i) );
		}
		}
			
//*		
//**		
//***		
//****		
		
		
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("");
			} 
				System.out.println();
		}	
		for (int i = 1; i <= 6; i++) {
			for (int j = 6 -i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
