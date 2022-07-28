package P20220727;

public class Performance extends Culture{
	   private String gen;
	   public Performance(String title, int pd, int actor, String gen) {
	      super(title, pd, actor);
	      this.gen = gen;
	   }

	   @Override
	   public void getInformation() {
		   System.out.printf("제목 : %s  \n 감독 : %d \n 배우 : %d \n 공연총점 : %d \n 공연평점 : %s \n",
		            getTitle(), getPd(),getActor(), getAu(), getGrade());


	   }
	   


	}