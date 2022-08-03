package P20220727;

public abstract class Culture {
	   private String title;
	   private int pd;
	   private int actor;
	   private int audience;
	   private int au;

	   public Culture(String title, int pd, int actor) {
	      this.title = title;
	      this.pd = pd;
	      this.actor = actor;
	   }

	   public int getPd() {
	      return pd;
	   }

	   public String getTitle() {
	      return title;
	   }

	   public int getActor() {
	      return actor;
	   }

	   public int getAudience() {
	      return audience;
	   }

	   public int getAu() {
	      return au;
	   }

	   public void setTotalScore(int score) {
		   audience++;
		   au += score;
	   }

	   public String getGrade() {
	      String star = " ";
	      double d = (double)au / audience;
	      for(int i=1; i <= d; i++) {
	         star += "★";
	      }
	      if( d > 4.5 ) {
	         star = " ★★★★★ ";
	      }
	      return star;
	      
	   }

	   public abstract void getInformation();
	}
