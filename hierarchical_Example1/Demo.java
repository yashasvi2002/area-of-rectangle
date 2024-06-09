package hierarchical_Example1;

public class Demo {

	public static void main(String[] args) {
        Person person = new Person("jignasha", 30);
        Student student = new Student("jaydip", 20, "S123");
        Employee employee = new Employee("tanvi", 40, "E156");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);

         //instanceof operator
//        checkInstance(person);
//        checkInstance(student);
//        checkInstance(employee);
    }

    public static void checkInstance(Person p) {
        if (p instanceof Student) {
            System.out.println(p.getName() + " is a Student");
        } else if (p instanceof Employee) {
            System.out.println(p.getName() + " is an Employee");
        } else if (p instanceof Person) {
            System.out.println(p.getName() + " is a Person");
        }
    }

}
