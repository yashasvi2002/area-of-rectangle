package connectivityProgram;

//prepared Statement -update the values in single/remaining query
import java.sql.*;


public class PreparedStatementDemo {

	public static void main(String[] args) throws Exception {
		
		
		String url="jdbc:mysql//localhost:3306"; //schema  //path -mysql && change path or not? -- localhost:3306
		String username="root";
		String password=""; //password
	    String query="select * from tab";
		
		
		Class.forName("com.mysql.cj.jdbc.Driver"); //forName is belong to the class//complete
		Connection con = DriverManager.getConnection(url,username,password); //passing the parameter
		PreparedStatement st=con.prepareStatement(query);
		
		ResultSet rs=st.executeQuery(query);  //return single resultant query
		
		while(rs.next()) //point our data is printed
		{
		String table="";
		table=rs.getInt(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getInt(4);
		System.out.println(table); 
		
		
		}
		st.close();
		con.close();
	}

}
