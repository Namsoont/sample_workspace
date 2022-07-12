package co.cdu.threads.synchronize;

public class Calculator {
	private int memory;
	public int getMemory() {
		return memory;
	}
	//synchronized <= 메소드 처리 시점에 다른 thread가 접근 못하도록 함.
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() +" : " + this.memory); //currentThread() 현재 실행되는 thread
	}
	
}
