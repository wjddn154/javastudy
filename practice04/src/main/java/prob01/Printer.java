package prob01;

public class Printer {

	/*
	 * public void println(int a) { System.out.println(a); }
	 * 
	 * public void println(double a) { System.out.println(a); }
	 * 
	 * public void println(String str) { System.out.println(str); }
	 * 
	 * public void println(boolean check) { System.out.println(check); }
	 */
	
	//파라미터에 대한 제너릭 <T> 위치가 return 타입 앞임
	//제너릭 쓰는 이유가 타입을 자유롭게 받을 수 있어서 인듯!
	public <T> void println(T t) {
		System.out.println(t);
	}
	

	public <T> void println(T... ts) {
		for(T t : ts) {
			System.out.println(ts);
		}
	}
	
	
	//Integer타입의 파라미터를 모두 받는듯
	public int sum(Integer... nums) {
		int sum = 0;
		for(Integer i : nums) {
			sum += i;
		}
		
		return sum;
	}
	
}
