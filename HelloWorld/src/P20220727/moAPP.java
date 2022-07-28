package P20220727;

public class moAPP {
	public static void main(String[] args) {
	      Culture culture = new Movie("추격자", 7, 5, "스릴러");
	      culture.setTotalScore(4);
	      culture.setTotalScore(4);
	      culture.setTotalScore(4);
	      culture.getInformation();
	      
	      System.out.println("-------------------------------");
	      
	      culture = new Performance("지킬앤하이드", 9, 10, "공포");
	      culture.setTotalScore(5);
	      culture.setTotalScore(5);
	      culture.setTotalScore(5);
	      culture.setTotalScore(5);
	      culture.setTotalScore(5);
	      culture.setTotalScore(5);
	      culture.setTotalScore(5);
	      culture.setTotalScore(5);
	      culture.setTotalScore(3);
	      culture.setTotalScore(3);
	      culture.getInformation();
	   }

	}