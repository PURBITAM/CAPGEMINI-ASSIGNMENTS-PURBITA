package jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo 
{

	public static void main(String[] args) 
	{
		Connection con=null;
		try 
		{
			//Step1 : Register the Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Step2 : Establish the connection
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:PURBITAORACL","system","PURBITA1234");
			//step 3 : Create Statement
			Statement stmt = con.createStatement();
			//step 4 : Execute the sql statement or query
			ResultSet rs=stmt.executeQuery("Select * from department");
			while(rs.next())
			{
				System.out.println("DID"+"\t"+"DNAME");
				System.out.println("==================");
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
				
			}
					
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			System.out.println("Close the DB Connection");
			//step 5:close the connection
			try 
			{
				con.close();
			} 
			catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
