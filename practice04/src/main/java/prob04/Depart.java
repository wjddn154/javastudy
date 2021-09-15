package prob04;

public class Depart extends Employee {

	private String department;
	
	public Depart(String name, int salary, String department) {
		//super() 부모메서드 호출 => Employee() 호출
		setName(name);
		setSalary(salary);
		this.department = department;
	}

	@Override
	public void getInformation() {
		System.out.println( "이름 : " + getName() + "\t연봉 : " + getSalary() + "\t부서 : " + department);

	}

}
