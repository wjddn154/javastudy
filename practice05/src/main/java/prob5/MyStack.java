package prob5;

import java.util.Arrays;

public class MyStack{
	
	private int top = -1;
	int size;
	private String[] MyStack;
	private String pop;
	
	//기존에 썻던 코드
	public MyStack(int size) {
		this.size = size;
		MyStack = new String[size];
	}
	
	public void push(String str) {
//		if(isFull()) {
//			//오버플로우시 배열복사 + (사이즈+1)
//			MyStack = Arrays.copyOf(MyStack, MyStack.length + 1);
//			size++;
//		}

		if(isFull()) {
			resize();
		}

		top++;
		MyStack[top] = str; //MyStack[++top] = str;

	}
	private void resize() {
		String[] temp = new String[MyStack.length * 2];
		for (int i = 0; i <= top; i++) {
			temp[i] = MyStack[i];
		}

		MyStack = temp;
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