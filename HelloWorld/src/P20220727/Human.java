package P20220727;

public class Human {
	public String name;
	
	public double height;
	public double weight;
	
	public Human() {
		
	}
	
	public String getName() {
		return name;
	}

	

	public double getHeight() {
		return height;
	}


	public double getWeight() {
		return weight;
	}

	

	public Human(String name, int age, int height, int weight) {
		this.name = name;
		
		this.height = height;
		this.weight = weight;
	}
	public void getInformation() {
		System.out.println("이름 : " + name + "키 : " + height + "몸무게 : " + weight );
	}
	
}
