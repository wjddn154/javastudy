package chapter04;

public class StringTest03 {

	public static void main(String[] args) {
		//String s1 = "Hello " + "World " + "Java "  + 1.8;
		//StringBuffer() -> 메서드를 호출하면 자기자신을 호출함
		String s1 = new StringBuffer("Hello ")
						.append("World ")
						.append("Java ")
						.append(1.8)
						.toString();
		
		
		
		System.out.println(s1);

		
		//성능 별로
		String s2 = "";
		for(int i=0; i < 10000000; i++) {
			//s2 = s2 + i;
			//s2 = new StringBuffer(s2).append(i).toString();
		}
		
		System.out.println(s2);

		
		//성능 굿
		StringBuffer sb2 = new StringBuffer("");
		for(int i=0; i < 10000000; i++) {
			sb2.append(i);
		}
		
		String s3 = sb2.toString();
		System.out.println(s3.length());
		
		
		
	}

}
