package co.cdu.threads.synchronize;

public class User1 extends Thread{
	private Calculator calculator;
	
	public void setCalculator (Calculator calculator) {
		setName("Uesr-1");
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory(100);
	}
}
