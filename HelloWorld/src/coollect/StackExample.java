package coollect;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<String> stack = new Stack();
		stack.push("홍길동");
		stack.push("김인수");
		stack.push("박찬호");
		
		
		String elem = stack.pop(); //요소를 빼내는작업. 제일 마지막에 있는걸 가져옴.
		System.out.println(elem);
		
		elem = stack.pop();
		System.out.println(elem);
		
		elem = stack.pop();
		System.out.println(elem);
		
		if(stack.isEmpty()) {
			System.out.println("스텍에 더 요소가 없음.");
		}
	}
}
