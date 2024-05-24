package csvoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CsvCrud {
	String url = "jdbc:mysql://localhost:3306/employees";
	String username = "root";
	String password = "root";
	Connection con;

	public CsvCrud() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			this.con = con;
			System.out.println("success");
		} catch (Exception e) 
		{
		}
	}

	void addStudent() {
		String query = "insert into student values(2,'Akshay','akshayoapaooski',23) ;";
		try {
			Statement st = con.createStatement();
			st.execute(query);
			System.out.println("inserted");
			con.close();

		} catch ( SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
