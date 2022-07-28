package P20220727;

public class Movie extends Culture {
	   
	   
	   private String gen;
	   
	   public Movie(String title, int pd, int actor, String gen) {
	      super(title, pd, actor);
	      this.gen = gen;
	   }

	   public String getGen() {
	      return gen;
	   }

	   @Override
	   public void getInformation() {
		   System.out.printf("제목 : %s  \n 감독 : %d \n 배우 : %d \n 공연총점 : %d \n 공연평점 : %s \n",
				   getTitle(), getPd(),getActor(), getAu(), getGrade());


	   }

	}