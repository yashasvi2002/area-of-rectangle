package hierarchical_Example1;

public class Student extends Person {
	private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", " + super.toString() + "]";
    }
}
