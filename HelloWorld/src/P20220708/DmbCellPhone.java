package P20220708;
/*
 * 상속 : 자식이 부모를 선택(extends)
 */
public class DmbCellPhone extends Cellphone {
	private int channel;
	
	public DmbCellPhone() {
		super(); //부모 생성자 호출.
	}
	public DmbCellPhone(String model, String color, int channel) {
		super(model, color);
//		super = model; <--private 막아놔서 사용불가.
		this.channel = channel;
	}
	
	public void turnOn() {
		System.out.println("dmd화면 on");
	}
	public void turnOff() {
		System.out.println("dmd화면 off");		
	}
	// overriding : 재정의 <- 자식클래스 입장
	@Override
	public void bell() {
		// TODO Auto-generated method stub
		System.out.println("벨이 울립니다.");
	}
	@Override
	public String toString() {
		return "model명은 " + super.getMode1() + ", 색상은" + super.getColor() + ", 채널은 " + channel + "입니다.";
	}
	
	
}
