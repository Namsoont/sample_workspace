package reference;

public class ArryExample04 {
	public static void main(String[] args) {
		//A반 80, 85, 83
		//B반 79, 84, 90
		int[][] banAry = new int[2][3];
		banAry[0][0] = 80;
		banAry[0][1] = 85;
		banAry[0][2] = 83;
		banAry[1][0] = 79;
		banAry[1][1] = 84;
		banAry[1][2] = 90;
		int sumA = 0;
		int sumB = 0;
		
		
		
		for(int i=0; i < banAry[0].length; i++) {
			sumA += banAry[0][i];
		}
		System.out.println("A반 평균 점수 : " + (double) sumA / banAry[0].length);
		for ( int i=0; i < banAry[1].length; i++) {
			sumB += banAry[1][i];
			
		} System.out.println("B반 평균 점수 : " + (double) sumB / banAry[1].length);

	
	}
			
		}
		
		
	


