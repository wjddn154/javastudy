package prob04;

public class Person {
	private static int numberOfPerson; // 전체 인구수
	private int age;
	private String name;
	
	/* 코드 작성 */
	public Person() {
		age = 12;
		name = "";
		numberOfPerson++;
	}

	public Person(String name) {
		age = 12;
		this.name = name;
		
		numberOfPerson++;
	}
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
		
		numberOfPerson++;
	}
	

	public void selfIntroduce() {
		System.out.println("내 이름은 " + getName() +"이며, 나이는 " + getAge() + "살입니다.");
	}
	
	public static int getPopulation() {
		
		
		return numberOfPerson;
	}
	
	

	//getter, setter 설정
	public static int getNumberOfPerson() {
		return numberOfPerson;
	}

	public static void setNumberOfPerson(int numberOfPerson) {
		Person.numberOfPerson = numberOfPerson;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
