package connectivityProgram;

//import java.util.*;
import java.sql.*;


public class JdbcDemo {

	public static void main(String[] args) throws Exception {
		
		
		String url="jdbc:mysql//localhost:3306"; //schema  //path -mysql && change path or not? -- localhost:3306
		String username="root";
		String password=""; //password
		String query="select empName from employee where empId=2";
		
		Class.forName("com.mysql.cj.jdbc.Driver"); //forName is belong to the class//complete
		Connection con = DriverManager.getConnection(url,username,password); //passing the parameter
		Statement st=con.createStatement();
		
		ResultSet rs=st.executeQuery(query);  //return single resultant query
		
		rs.next(); //point our data is printed
		
		String name=rs.getString("");
		System.out.println(name); 
		
		st.close();
		con.close();
	}

}
