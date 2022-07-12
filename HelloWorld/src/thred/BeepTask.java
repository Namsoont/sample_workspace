package thred;

import java.awt.Toolkit;

public class BeepTask implements Runnable {

	@Override
	public void run() {
		//스피커소리
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
				try {
					Thread.sleep(800);
				} catch (InterruptedException e) {
					e.printStackTrace();
					
				}
		
	}

	
	
	}
}
