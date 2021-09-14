package collection;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		
		s.push("맨두");
		s.push("갬져");
		s.push("림자");
		
		while(!s.isEmpty()) {
			String str = s.pop();
			System.out.println(str);
		}
		
		//비어있는 경우에는 예외 발생
		//s.pop();

		s.push("맨두");
		s.push("갬져");
		s.push("림자");
		
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.pop());
		
	}

}
