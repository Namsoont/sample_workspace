package reference;

public class ArrayExample02 {
	public static void main(String[] args) {
		int[] intAry = {20, 27, 15, 33, 29};
		// 배열의 크기: 5, intAry.length<- 속성
		System.out.println("배열의 크기" + intAry.length);
		for (int i =0; i < intAry.length; i++) {
			System.out.println(intAry[i]);
			
			if (intAry[i] > 25) {
				System.out.println("25보다 큰 수 : " + intAry[i]);
				
			}
			if (intAry[i] % 2 == 0) {
				System.out.println("짝수 : " + intAry[i]);
				
			} 
			if (i %2 ==0) {
				System.out.println("짝수 위치 : " + intAry[i]);
			}
					
		}
		
		int sum = 0;
		for (int i = 0; i <intAry.length; i++) {
			sum += intAry[i];
			
		} 
		System.out.println("변수 총합 : " + sum);
		
			
		intAry[2] = 30;
		int temp = intAry[0];
		intAry[0] = intAry[1];
		intAry[1] = temp;
		System.out.println(" 값 순서(위치) 바꾸기/복사하기 : " + intAry[0] + intAry[1]);
		
		
	}

}
