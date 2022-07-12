package thred;

class CalcThread extends Thread{
	
	public CalcThread(String name) {
		setName(name);
		
		
	}
	@Override
	public void run() {
		for(int i = 0; i < 200000000; i++) {
			if(i%500000000 == 0 ) {
				try {
					Thread.sleep(5);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			} 
			
		}
		System.out.println("Thread:  " + getName());
	}
		
}

public class PriorityExample {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			Thread thread = new CalcThread("Thread-" + i);
			if (i != 10) {
				thread.setPriority(Thread.MIN_PRIORITY);
			} else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			thread.start();
		}
	}
}
