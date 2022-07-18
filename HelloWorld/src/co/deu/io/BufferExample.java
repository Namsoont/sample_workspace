package co.deu.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import javax.imageio.stream.FileImageInputStream;

/*
 * 보조스트림 생성. 바이트기반 => 문자기반 (InputStereamReader, OutputSteremWriter)
 * 				버퍼스트림(성능향상) 
 */
public class BufferExample {
	public static void main(String[] args) {
		bufferReaderWriter();
			}
	
	//버퍼스트림
	public static void bufferReaderWriter() {
		try {
			
		
		FileInputStream fis = new FileInputStream("c:/Dev/t1.png");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("c:/Dev/buffer.png");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		while (true) {
			int bt = bis.read();
			if (bt == -1) {
				break;
				
			}
			bos.write(bt);
		}
		bos.flush();
		bos.close();
		bis.close();
		fis.close();
		fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
			System.out.println("실행: ");
		}
	
	public static void streamtToReader() {
		InputStream is = System.in; // 키보드로 값을 읽어 주겠다.(입력)
		InputStreamReader isr = new InputStreamReader(is);
		char[] cbuf = new char[10];
		System.out.print("입력> ");
		try {
			int b = isr.read(cbuf);
			for(int i = 0; i < b; i++) {
				System.out.print((char) cbuf[i]);
				
			}
			System.out.println();
			isr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행: ");
	}
	
	public static void stremToWriter() {
		// 바이트 스트림 -> 문자  스트림.
				OutputStream os = System.out; //키보드로 입력.  System.in <-모니터
				OutputStreamWriter osw = new OutputStreamWriter(os);
				
				Scanner scn = new Scanner(System.in);
				System.out.println("입력 > ");
				String text = scn.nextLine();
				
				
				try {
					osw.write(text + "\n");
					osw.write("실행");
					osw.flush();
					osw.close();
					
					
				} catch (IOException e) {
					e.printStackTrace();
				}
	}
}
