package prob5;

import java.util.Arrays;

public class MyStack{
	
	int top = -1;
	int size;
	String[] MyStack;
	String pop;
	
	//기존에 썻던 코드
//	public MyStack(int size) {
//		top = -1;
//		this.size = size;
//		MyStack = new String[size+2];
//	}
	
	public MyStack(int size) {
		this.size = size;
		MyStack = new String[size];
	}
	
	public String push(String str) {
		top++;
		if(isFull()) {
			//오버플로우시 배열복사 + (사이즈+1)
			MyStack = Arrays.copyOf(MyStack, MyStack.length + 1);
			size++;

		}
		MyStack[top] = str;

		return null;
	}

	//stack pop 메소드
	public String pop() throws MyStackException {
		
		if(isEmpty()) {
			 throw new MyStackException();
		} else {
			pop = MyStack[top];
			MyStack[top--] = null;
		}
		
		return pop;
	}
	
	//stack이 비었는지 확인하는 메소드
	public boolean isEmpty() {
		
		return (this.top == -1);
	}
	
	//stack이 full인지 확인하는 메소드
	public boolean isFull() {	
		
		return (this.top == this.size-1);
	}
	
}