package P20220803;

public class lotto {
	public static void main(String[] args) {
		int[] lottoNo = new int[6];
		
		for(int i=0; i < 6; i++) {
			
			lottoNo[i] = (int)(Math.random()*45) + 1;
			
			//i=4
			//if없어도 돌아감
			
			if(i > 0) {
				// j = 0~3, i = 4
				
				
				for (int j = 0;  j < i ; j++) {
					if (lottoNo[j] == lottoNo[i]) {
						i -=1;
						System.out.println("중복제거");
						break;
					}
				}
			}
		}
	}
}
