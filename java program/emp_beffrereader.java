import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Employee s1 = new Employee(); 

        try {
            System.out.print("Enter employee name: ");
            String name = reader.readLine();
            s1.setName(name);

            System.out.print("Enter employee id: ");
            int id = Integer.parseInt(reader.readLine());
            s1.setId(id); 

            System.out.println("Employee Name: " + s1.getName());
            System.out.println("Employee ID: " + s1.getId());

        } catch (IOException e) {
            System.out.println("An error occurred while reading input: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid format for employee id. Please enter a valid integer.");
        }
    }
}

/*
Enter employee name: jignasha
Enter employee id: 100
Employee Name: jignasha
Employee ID: 100

=== Code Execution Successful ===
*/