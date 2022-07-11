package P20220711;

import java.lang.reflect.Method;

public class ClassEx {
	public static void main(String[] args) {
		//클래스의 정보 얻어오기.
		try {
			Class cls = Class.forName("java.lang.String"); // forName 예외처리 해야됨. 마우스올려서 2번째
			cls = String.class;
			
			System.out.println(cls.getName()); //클래스 이름
			
			Method[] methods = cls.getMethods(); //계열타입으로 리턴
			for (Method method : methods) {
				System.out.println(method.getName());
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
	}
}
