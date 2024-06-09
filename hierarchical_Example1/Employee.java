package hierarchical_Example1;

public class Employee extends Person {
	private String employeeId;

    public Employee(String name, int age, String employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", " + super.toString() + "]";
    }
}
