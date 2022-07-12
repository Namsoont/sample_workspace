package co.cdu.threads.synchronize;

public class User2 extends Thread{
	private Calculator calculator;
	
	public void setCalculator (Calculator calculator) {
		setName("Uesr-2");
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory(50);
	}
}
