package co.edu;
/* 추가문제) 아래와 같이 변수 값이 주어질 경우 각 자리의 합을 구해 출력하세요. 
예시) 373 일 경우 3 + 7 + 3 = 13 으로 결과는 13입니다.
힌트) 곱하기 연산자 (*), 나누기 연산자( / ) 와 빼기 연산자 ( - ) 를 이용하세요. */
public class yedam4 {
	 public static void main(String[] args) {
		 int value = 485; 
		 int no = value / 100;
		 int no1 = value / 10 - no * 10;
		 int no2 = value - (no * 100 + no1 * 10);
		 
		 System.out.printf("value : %d, %d + %d + %d = %d ", value, no, no1, no2,(no+no1+no2) );
		 
	}
}
