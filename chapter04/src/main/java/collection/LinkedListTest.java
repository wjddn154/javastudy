package collection;

import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		list.add("맨두");
		list.add("갬져");
		list.add("임자");
		
		//순회1
		for(int i=0; i<list.size(); i++) {
			String s= list.get(i);
			System.out.println(s);
		}
		
		
		//삭제
		list.remove(2);
		
		//순회2
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		
		//hasNext()를 한번 돌았기 때문에 출력안됨
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		
		//순회3
		for(String s : list) {
			System.out.println(s);
		}

	}

}
