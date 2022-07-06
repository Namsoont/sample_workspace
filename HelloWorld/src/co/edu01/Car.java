package co.edu01;
/*
* 자동차(OBject) -> class
*/
public class Car {
	// 속성 : 필드.
	String model;
	int price;
	int maxspeed;
	int speed;
	double weight;
	double width;
	
	//생성자: 초기값을 지정.
	public void Car() {
		System.out.println("생성자 호출.");
		maxspeed = 200;
	}
	public Car(String model, int maxspeed) {
		this.model = model;
		this.maxspeed = maxspeed;
	}
	// 동작(기능): 메소드.
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void showSpeed() {
		System.out.println("현제 속도는 " + speed + "km/h 입니다.");
	}
	public void run() {
		System.out.println(model + "자동차가 달립니다.");
	}
	public void start() {
		System.out.println(model + "자동차가 출발 합니다.");
	}
	public void stop()	{
		System.out.println(model + "자동차가 멈춥니다.");
	}
}
