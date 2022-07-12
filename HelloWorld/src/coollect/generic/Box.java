package coollect.generic;
/*
 * 제네릭: 타입을 클래스 정의하는 시점이 아니라 사용하는 시점에 지정한다.
 */
public class Box<T> { //Box라는 클래스        <T> <--나중에 선언하겠다.
	private T obj;
	
	
	public void set(T obj) {
		this.obj = obj;
		
	}
	
	public T get() {
		return obj;
	}
}
