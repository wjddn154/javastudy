package prob5;

public class MyStack{
	
	String[] array;
	int index = -1;
	int top;
	int size;
	String[] MyStack;
	String pop;
	
//	public MyStack(int size) {
//		top = -1;
//		this.size = size;
//		MyStack = new String[size+2];
//	}
	
	public MyStack(int size) {
		array = new String[size];
	}
	
	public String push(String str) {
		top++;
		if(isFull()) {
//			System.out.println("오버플로우");
//			MyStack[size] = MyStack[size++];
		}
		MyStack[top] = str;

		return null;
	}

	public String pop() throws MyStackException {
		
		if(isEmpty()) {
			 throw new MyStackException();
		} else {
			pop = MyStack[top];
			MyStack[top--] = null;
		}
		
		return pop;
	}
	
	public boolean isEmpty() {
		
		return (this.top == -1);
	}

	public boolean isFull() {	
		
		return (this.top == this.size-1);
	}
	
}