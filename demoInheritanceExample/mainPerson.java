package demoInheritanceExample;

public class mainPerson extends Person{

	public static void main(String[] args) {
		Person p=new Person();
		p.setPname("john");
		p.setCity("Ahmedabad");
		p.setAge(25);
		p.setIncome(300000);
		
		System.out.println(p);
	}

}
