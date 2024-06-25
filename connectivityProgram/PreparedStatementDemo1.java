package connectivityProgram;

import java.sql.*;

public class PreparedStatementDemo1 {
	public static void main(String[] args) throws Exception {
			
			
			String url="jdbc:mysql//localhost:3306"; //schema  //path -mysql && change path or not? -- localhost:3306
			String username="root";
			String password=""; //password -12345
			int id=103;
		    String name="Loy";
			
		    String query="insert into tab values(?,?)";
			
			Class.forName("com.mysql.cj.jdbc.Driver"); //forName is belong to the class//complete
			Connection con = DriverManager.getConnection(url,username,password); //passing the parameter
			PreparedStatement st=con.prepareStatement(query);
			
			st.setInt(1, id);
			st.setString(2, name);
			
			
			int rs=st.executeUpdate();  
			System.out.println(rs+"rows affected");
			
			st.close();
			con.close();
		}

	}


