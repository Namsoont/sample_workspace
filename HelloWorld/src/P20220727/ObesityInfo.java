package P20220727;

public class ObesityInfo extends StandardWeightInfo {
	
	public ObesityInfo() {
		super();
	}
	
	public ObesityInfo(String name, int height, int weight) {
		super(name, height, weight);
	}
	 public double getObesity() {
		double b = (getWeight() - a)/a * 100;
		return b;
	 }

	@Override
	public void getInformation() {
		System.out.printf("%s님의 신장 %.0f 몸무게 %.1f 비만 입니다.",getName(),getHeight(),getWeight());
		
	}

	
	}
	
	

