package P20220803;

public abstract class Culture {
	//abstract 추상화클래스
	protected String title;
	protected int director;
	protected int actor;
	protected int audience;
	protected int totalScore;
	
	public Culture(String title, int director, int actor) {
		this.title = title;
		this.director = director;
		this.actor = actor;
	}
	 public void setTotalScore(int score) {
		 audience ++;
		 totalScore =+ score;
	 }
	 public String getGrade() {
		 int avg = totalScore/audience;
		 String grade = null;
		 switch (avg) {
		 case 1:
			 grade = "☆";
			 break;
		 case 2:
			 grade = "☆☆";
			 break;
		 case 3:
			 grade = "☆☆☆";
			 break;
		 case 4:
			 grade = "☆☆☆☆";
			 break;
		 case 5:
			 grade = "☆☆☆☆☆";
			 break;
			 
		 }
		 
		 return "";
		
	 }
	 
	 //추상화 메소드
	 public abstract void getInformation();
}
