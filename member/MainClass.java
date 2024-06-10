package member;

public class MainClass {
	public static void main(String args[]) {

		Employee e = new Employee("Ashish", "9913645349", "Ahmedabad",60,75000,"JAVA");
		Manager m = new Manager("HArdik", "9909415360", "Sura", 50,18000,"Android Development");
		
		System.out.println(e);
		System.out.println(m);
	}
}
