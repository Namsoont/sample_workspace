package co.edu;

public class Variable {
	public static void main(String[] args) {
		byte b1 = 127; // -128 < byte < 127
		short s1 =32767; // 128*2*2*2*2*2*2*2*2
		int n1 = 0; //-2147483648 < int < 2147483647
		long I1 = 0; // -9223372036854775808
		// 더하기,빼기 (int) 로 같은 타입 (b1+20 할려면 byte뺴고 int)
		
		//byte result = 10 + 20;  //int b1 + 20;
		//long result = l1 + (long) 20; 데이터타입 변환 : 자동형변환(Promotion)
		//result = (int) l1 + 20; 데이터타입 변환 : 강제형변환(casting)
		
		
		System.out.println(Long.MIN_VALUE);
		
		char c1 = 'z'; // 문자하나의 숫자 값을 담고있다. a=97 A=66
		//c1 = c1 + 1; // int 타입 연산 c1++(c1을 더해서 계산)
		//for(int i = 0;  i< 27; i++) {
		System.out.println((int) c1+1);
		
		// 이력변경 추가( 2022.07.01 12:55 )
		System.out.println("이력변경추가.");
		//깃에서 수정한 작업입니다.
		System.out.println("깃에서 작업함");
	}
}
