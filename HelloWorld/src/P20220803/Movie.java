package P20220803;

public class Movie extends Culture{

	
	
	String gerne;

	public Movie(String title, int director, int actor) {
		super(title, director, actor);
	}

	@Override
	public void getInformation() {
		System.out.println("영화제목 : " + title); 
		System.out.println("감독 수 " + director);
		System.out.println("배우 수 : " + actor);
		System.out.println("영화 총점 : " + totalScore);
		System.out.println("영화 평점 : " + getGrade());
		
	}
	
	

	
	
	
	
}
