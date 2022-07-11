package P20220711;
/*
 * 배열의 크기를 벗어나서 저장 or 읽어와서 출력.
 */
public class ArrayIndexOutofBoundsEx {
	public static void main(String[] args) {
		int[] intAry = new int[5];
		
		intAry[0] = 20;
		intAry[1] = 30;
//		intAry[5] = 50;
		
		for(int i = 0; i < intAry.length; i++) {
			try {
			intAry[i] = (int) (Math.random() * 100) + 1;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("인텍스 범위를 벗어났습니다.");
			}
		}
		System.out.println("프로그램 종료");
	
	}
}
