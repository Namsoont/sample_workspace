package P20220803;

public class App {

	public static void main(String[] args) {
		Culture moive = new Movie("추격자", 7, 5);
		moive.setTotalScore(4);
		moive.setTotalScore(5);
		moive.setTotalScore(3);
		moive.setTotalScore(5);
		moive.setTotalScore(4);
		
		moive.getInformation();
		System.out.println("==========================");
		
		Culture perfor = new Performance("지킬앤하이드",9,10);
		perfor.setTotalScore(5);
		perfor.setTotalScore(1);
		perfor.setTotalScore(2);
		perfor.setTotalScore(4);
		perfor.setTotalScore(5);
		perfor.setTotalScore(1);
		perfor.setTotalScore(2);
		perfor.setTotalScore(3);
		perfor.setTotalScore(4);
		perfor.getInformation();
		
	}
}
