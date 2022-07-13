package co.deu.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CharExample {
	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("C:/Dev/test.txt");
			char[] cbuf = new char[10];
			int buf = 0;
			
			while ((buf = fr.read(cbuf)) != -1) {
			for(int i = 0; i < buf; i++) {
				System.out.print(cbuf[i]); //읽어들인 버퍼(배열(cbuf)에있는) 크기만큼 반복
			}
			
			System.out.println();
			}
			fr.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("실행: ");
			
		}
	
	
	
	
	public static void reader1() {
		
		try {
		FileReader fr = new FileReader("C:/Dev/test.txt");
		
		while (true) {
		int buf = fr.read(); //읽은 문자값을 리턴. 하나씩
		if (buf == -1) {
			break;
		}
		System.out.print((char) buf); //2바이트씩 읽어서 하나씩 처리.
		}
		fr.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행.");
	}
	public static void writer1() {
	
		Scanner scn = new Scanner(System.in);
		System.out.println("입력: ");
		String txt = "";
		
		try {
		FileWriter fw = new FileWriter("C:/Dev/test.txt");
		while (true) {
			try {
			 txt = scn.nextLine();
			} catch (NoSuchElementException e) {
				break;
			}
			fw.write(txt + "\n");
		}
		fw.flush();
		fw.close();
		
				
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행.");
		
	}
}
