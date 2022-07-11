package P20220711;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ThrowExceptionEx {
	public static void main(String[] args) {
		
		
	try {
		method1();
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	
	}
	public static void method1() throws ClassNotFoundException, SQLException {  
		Class.forName("java.lang.String"); //컴파인 시점에 예외
		
		DriverManager.getConnection("", "", "");
	}
}
