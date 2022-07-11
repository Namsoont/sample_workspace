package P20220711;

import java.io.UnsupportedEncodingException;

public class StringEx {
 public static void main(String[] args) {
	
	 String name = "홍길동";
	 name = new String("홍길동");
	 
	 byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97}; //byte 계열로 문자를 만들수있다.
	 
	 
	 try {
		name = new String(bytes, 0, 5, "UTF-8"); // UTF-8 쓸려면 try 써서 catch 해야함.
	} catch (UnsupportedEncodingException e) {
		e.printStackTrace();
	}
	 System.out.println(name);
	 
	 
	 char fName = name.charAt(0);
	 System.out.println(fName);
	 
}
}
