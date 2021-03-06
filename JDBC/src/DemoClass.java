/*
 * 1. import ----> java.sql
 * 2. load and register the driver----> com.mysql.jdbc.Driver
 *    for name loads the driver
 * 3. create connection ----> connection
 * 4. create a statement -----> statement
 * 5. execute the query ->
 * 6. process the results ->
 * 7. close
 */
import java.sql.*;
public class DemoClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3307//students";
		String uname="root";
		String pass="";
		String query="select username from students where userid=3";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);//can store tabular data
		
		rs.next(); //used to fetch the record
		String name = rs.getString("username");
		st.close();
		con.close();
	}

}
