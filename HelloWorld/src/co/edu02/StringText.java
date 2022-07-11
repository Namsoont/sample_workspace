package co.edu02;

public class StringText {
	public static void main(String[] args) {
		
	
	String[] str = {"자바", "자바다", "이것이자바다", "자바스크립트", "자 바"};
	//"자바" 문자열 포함.
	int cnt = 0;
	for (int i = 0; i < str.length; i++) {
		if (str[i].indexOf("자바") != -1 ) {
			System.out.println(str[i] + ":    자바관련");
			cnt++;
			
		}	else {
			System.out.println(str[i] + ":  관련없음");
			
		}
		
	}
	System.out.println("자바관련: " + cnt + "개");
	
	
	String patn = "c:/images/hello.png"; // 파일의 확장자, 파일명
	
	String tel = "";
	String[] tels = { " 031", " 2103", "3478 " }; //tel에 031-2103-3478
	// tel에 031-2103-3478
	tel = tels[0].trim()+ "-" + tels[1].trim().replace("", "") + "-" + tels[2].trim();
	System.out.println(tel);
	String[] ssn = {"970403-1234123", "0105033456123", "980123/2412345", "0202023217891" };  //남여구분
	for (int i = 0; i < ssn.length; i++) {
		checkGender(ssn[i]);
	}	
	
	}
	public static void checkGender(String ssn) {
		
		char sex = ssn.charAt(7);
		
		if (ssn.length() == 13) {
			sex = ssn.charAt(6);
		} 
		
		switch (sex) {
		case '1' :
		case '3' :
			System.out.println("남자 입니다.");
			break;
		case '2' :
		case '4' :
			System.out.println("여자 입니다.");
			break;
		
	}
	}
}