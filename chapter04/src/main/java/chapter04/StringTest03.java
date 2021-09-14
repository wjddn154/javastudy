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
		
		System.out.println("====================");
		//String method들...
		String s4 = "aBcABCabcAbc";
		System.out.println(s4.length());
		System.out.println(s4.charAt(2));	//.charAt(i) -> i번째 요소
		System.out.println(s4.indexOf("abc"));	//.indexOf("str") -> "str"의 위치
		System.out.println(s4.indexOf("abc", 7));	//.indexOf("str", i) -> i번째에서 시작하여 "str"의 위치
		System.out.println(s4.substring(3));	//.substring(i) -> i번째에서 시작
		System.out.println(s4.substring(3, 5));	//.substring(i, j) -> i번째에서 j번째 미만의 요소들
		
		
		System.out.println("====================");
		String s5 = "    ab    cd    ";
		String s6 = "efg,hij,klm,nop,qrs";
		
		String s7 = s5.concat(s6);	//String s7 = s5 + s6 -> 동일 의미
		System.out.println(s7);
		
		System.out.println("----" + s5.trim() + "----");	//.trim() : 앞뒤의 공백만 제거
		System.out.println("----" + s5.replaceAll(" ", "") + "----");	//.replaceAll("String1", "String2") : 모든 String1을 String2로 변환
		
		String[] tokens = s6.split(",");
		//향상된 for문 : 배열처럼 여러 원소로 이루어진 집합의 모든 원소에 대해 특정 작업을 반복하기 위해 사용
		for(String s : tokens) {
			System.out.println(s);
		}
		
		String[] tokens2 = s6.split(" ");	//split을 못하는 코드
		for(String s : tokens2) {
			System.out.println(s);
		}
		
		
		
	}

}
