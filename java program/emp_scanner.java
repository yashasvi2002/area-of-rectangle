import java.util.Scanner;

class Employee {
    private String name; 
    private int id; 

    public void setName(String n) {
        this.name = n;
    }
    
    public String getName() {
        return name;
    }

     public void setId(int r) {
        this.id = r;
    }
    
    public int getId() {
        return id;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        Employee s1 = new Employee(); 

      
        System.out.print("Enter employee name: ");
        String name = scanner.next();
        s1.setName(name);

      
        System.out.print("Enter employee id: ");
        int id = scanner.nextInt();
        s1.setId(id); 

       
        System.out.println("Employee Name: " + s1.getName());
        System.out.println("Employee ID: " + s1.getId());

      
    }
}


/*Enter employee name: hardik
Enter employee id: 101
Employee Name: hardik
Employee ID: 101

=== Code Execution Successful ===
*/