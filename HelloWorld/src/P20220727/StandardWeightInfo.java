package P20220727;

public class StandardWeightInfo extends Human {
	double a;
	
	public StandardWeightInfo() {
		
	}
	
	public StandardWeightInfo(String name, double height,double weight) {
		super.name = name;
		super.height = height;
		super.weight = weight;
		
		
	}
	public double getStandardWeight() {
		a = ((getHeight() - 100) * 0.9);
		return a;
	}
	
	@Override
	public void getInformation() {
		System.out.printf("%s님의 신장은 %.0f 표준체중은 %.1f 입니다. \n",getName(),getHeight(),getStandardWeight());
		

		
	} 
	
	
}
