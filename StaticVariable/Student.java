package StaticVariable;

public class Student 
{
	  int rollno;//instance variable  
	   String name;  
	   static String college ="ITS";//static variable  
	  
	   //constructor  
	   Student(int r, String n)
	   {  
	   rollno = r;  
	   name = n;  
	   }

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getCollege() {
		return college;
	}

	public static void setCollege(String college) {
		Student.college = college;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name +", college=" + college+"]";
	}

	
	
	 
	
	   
	   
	   
}
