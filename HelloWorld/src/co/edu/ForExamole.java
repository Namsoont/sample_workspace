package co.edu;

public class ForExamole {
	public static void main(String[] args) {
		//sum = sum + i;
				int sum = 0;
				for(int i = 1; i <= 10; i++) {
					if (i % 2 == 0 ) {
						sum = sum + i;
					}
				System.out.println("i의 값 : "+ i + ", sum의 값 " + sum);	
				}
				System.out.println("홀수 합: " + sum);
				// 1 ~ 10 까지 result => 누적..
				int result = 0;
				for (int i = 1; i <= 10; i += 3) {
					result += i;
				}
				System.out.println("1 ~ 10 까지 누적 합 : " + result);
			// 1 ~ 10 까지 출력
				for (int i = 1; i <= 10; i++) {
					System.out.println(i);
				}
				// 10 ~ 1 까지 출력
				for (int i = 10; i>=1; i--) {
					System.out.println(i);
				}
				
			}
		}