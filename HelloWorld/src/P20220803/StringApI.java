package P20220803;

public class StringApI {
	public static void main(String[] args) {
		//100번지
		String a = "aaa";
		
		//"aaabbb" 101번지
		a = a+"aaa";
		
		StringBuilder sb = new StringBuilder();
		
		//100번지
		sb.append("aaa");
		//100번지
		sb.append("bb");
		
		
//		String b = "bbb";
//		
//		String c = new String("aaa");
//		
//		if ( a==c ) //주소값비교 (객체값)
//			
//		if( a.equals(c)); // 안에있는 데이터 구분
	}
}
