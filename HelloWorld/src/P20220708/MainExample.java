package P20220708;

public class MainExample {
	public static void main(String[] args) {
		
		DmbCellPhone phone = new DmbCellPhone();
		phone.setMode1("AnyCall");
		phone.setColor("white");
			
		//부모
		phone.powerOn();
		phone.bell();
		phone.sendVoice();
		phone.receiveVoidce();
		
		//자식
		phone.turnOn();
		phone.turnOff();
		
		
		phone.powerOff();
		
		//SmartPhone 기능.
		SmartPhone sphone = new SmartPhone();
		sphone.setMode1("Galaxy");
		sphone.setColor("Black");
		
		sphone.powerOn();
		sphone.powerOff();
		
		System.out.println("자동 형변환>>>>>>>>>");
		
		// 부모 >자식. long <- int : 자동형변환, int <- long <- 강제형변환.
//		Cellphone dphone = new DmbCellPhone("i-phone", "Red", 100);
//		System.out.println(dphone.toString());
		
		Cellphone dphone = new DmbCellPhone();
		Cellphone cphone = new Cellphone();
		cphone.setMode1("LG Phone");
		cphone.setColor("Gray");
		System.out.println(cphone.toString());
		
		
		if(dphone instanceof DmbCellPhone) {
			DmbCellPhone dcp = (DmbCellPhone) dphone; //컴파일오류(X)
			dcp.powerOn();
			dcp.turnOn();
			dcp.powerOff();
		}
		
		
	}
}
