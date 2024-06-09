package demoInheritanceExample;

public class Person {
	private String pname;
	private String city;
	private int age;
	private int income;
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	@Override
	public String toString() {
		return "Person [pname=" + pname + ", city=" + city + ", age=" + age + ", income=" + income +  "]";
	}
	
	
	
}
