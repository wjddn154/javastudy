package chapter03;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setGrade(1);
		s1.setMajor("CS");
		
		Person p1 = (Person)s1; //upcasting(암시적, Implicity)
		p1.setName("허정우");
		
		Student s2 = (Student)p1; //downcasting(명시적, explicity)
		s2.setMajor("cs");
		
//		((Person)s1).setName("허정우");
		
		
		//실행 결과
		//Person() called -> 부모가 먼저 불림
		//Student() called -> 부모 다음 자식이 불림

	}

}
