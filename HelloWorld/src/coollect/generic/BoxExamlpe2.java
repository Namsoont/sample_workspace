package coollect.generic;

public class BoxExamlpe2 {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set("문자열");
		String result = box.get();
//		Integer result1 = box.get(); // String -> Integer X
		
		
		Box<Integer> intBox = new Box<Integer>();
		intBox.set(100); //int 기본데이터 타입이 Integer (Boxing) 참조데이터타입.
		int result1 = intBox.get(); //Integer => int (unBoxing)
		System.out.println(result1);
	}
}
