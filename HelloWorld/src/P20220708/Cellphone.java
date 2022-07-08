package P20220708;
/*
 * 상속 ( 부모 <= 자식)
 * Cellphone <- DmbCellphone
 */
public class Cellphone extends Object{
	//field
	private String model;
	private String color;
	
	//constructor.
	public Cellphone() { }	// default constructor
	public Cellphone(String model, String color) {
		this.model = model;
		this.color = color;
		
					
	}
		
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	public void bell() {
		System.out.println("bell");
	}
	public void sendVoice() {
		System.out.println("메세지 전송");
	}
	public void receiveVoidce() {
		System.out.println("메세지 수신");
	}
	public String getMode1() {
		return model;
	}
	public void setMode1(String mode1) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//재정의.
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "model명은 " + model + ", 색상은" + color + "입니다.";
	}
	

}
