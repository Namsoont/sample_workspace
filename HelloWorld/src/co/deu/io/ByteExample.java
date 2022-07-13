package co.deu.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
	
public class ByteExample {
	public static void main(String[] args) {
		long start = System.nanoTime();
		try {
			FileInputStream fis = new FileInputStream("C:/Dev/t1.png");
			FileOutputStream fos = new FileOutputStream("C:/Dev/t12.png");
			byte[] arr = new byte[100]; //이미지 파일이 커서 한번에 100개씩 가져오기위함.
			
			while (true) {
				int buf = fis.read(arr);
				if(buf == -1) {
					break;
				}
				fos.write(arr);
			}
			
			fos.flush();
			fos.close();
			fos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		long end = System.nanoTime();
		System.out.println("처리시간: " + (end - start) + "NanoTime");
		
		
		
	}
		public static void read2() {
			
		
		try {
			FileInputStream fis = new FileInputStream("C:/Dev/data2.dat");
			byte[] arr = new byte[2];
			while(true) {
				int buf = fis.read(arr); // 10, 20, 30 -> 2
				if(buf == -1) {
					break;
				}
				for(int i = 0; i < buf; i++) {
					System.out.println(arr[i]);
				}
				System.out.println();
			}
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
	}

		
			public static void wrire2() {
				byte[] arr = { 10, 20, 30 };
				try {
					FileOutputStream fos = new FileOutputStream("C:/Dev/data2.dat");
					fos.write(arr); 
					fos.flush();//정보 내보내기
					fos.close();//다시반환
				} catch (IOException e) {
					e.printStackTrace();
				}
					System.out.println("실행.");
				}
			
	
		
		public static void read1() {
			
		
		try {
		FileInputStream fis = new FileInputStream("C:/Dev/data1.dat");
		
		while (true) {
			int buf = fis.read();
			if (buf == -1) {
				break;
			}
			System.out.println(buf);
		}
		fis.close();
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	
		
	}
	

	public static void wrire1() {
		
	try {
		FileOutputStream fos =new FileOutputStream("C:/Dev/data1.dat");
		byte a= 10, b=20, c=30;
		
		fos.write(a);
		fos.write(b);
		
		fos.flush();
		fos.close();
	
	} catch (IOException e) {
		e.printStackTrace();
	}
		
	System.out.println("실행완료");
	
	
}
	
}
