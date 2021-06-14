package jdbccrudeecample;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductManagementSystem {
	static Connection con=null;
	static Statement stmt=null;
	static PreparedStatement pstmt=null;
	static ResultSet rs=null;
	static Scanner sc=new Scanner(System.in);
	public Connection dbConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:PURBITAORACL","system","PURBITA1234");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}//close of dbconnection method
	
	public void createTableProduct() {
		try {
			stmt=con.createStatement();
			String createTable="create table product(pid number,pname varchar2(20),price number(10,2))";
			int i=stmt.executeUpdate(createTable);
			System.out.println(i);
			if(i==0) 
			{
				System.out.println("Table Created Successfully");
			}
			else 
			{
				System.out.println("Table Not Created Successfully");
			}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				stmt.close();
			}
			catch(SQLException e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	public void insertIntoProduct() 
	{
		try 
		{
			stmt=con.createStatement();
			String insertData="insert into product values(123,'Pen',25.45)";
			int i = stmt.executeUpdate(insertData);
			if(i!=0) 
			{
				System.out.println("data inserted successfully");
			}
			else 
			{
				System.out.println("data is not inserted successfully");
			}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				stmt.close();
			}
			catch(SQLException e) 
			{
				e.printStackTrace();
			}
		}
	}
	int productId;
	String productName;
	float productPrice;
	public void readProductDetails()
	{
		System.out.println("ENTER PRODUCT DETAILS : ");
		System.out.print("Enter Product Id : ");
		productId=sc.nextInt();
		System.out.print("Enter Product Name : ");
		sc.nextLine();
		productName=sc.nextLine();
		System.out.print("Enter Product Price : ");
		productPrice=sc.nextFloat();
	}
	
	public void insertIntoProductUsingPS()
	{
		try 
		{
			
			String insertData="insert into product values(?,?,?)";
			pstmt=con.prepareStatement(insertData);
// TYPE 1 -> inserting data			
//			pstmt.setInt(1,127);
//			pstmt.setString(2,"Pencil");
//			pstmt.setFloat(3,11.30f);

// TYPE 2 -> inserting data
			readProductDetails();
			pstmt.setInt(1,productId);
			pstmt.setString(2,productName);
			pstmt.setFloat(3,productPrice);
			
			int i = pstmt.executeUpdate();
			if(i!=0) 
			{
				System.out.println("data inserted successfully");
			}
			else 
			{
				System.out.println("data is not inserted successfully");
			}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				pstmt.close();
			}
			catch(SQLException e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	public void getAllProducts() 
	{
		try 
		{
			stmt=con.createStatement();
			rs=stmt.executeQuery("Select * from product");
			System.out.println("PID"+"\t"+"NAME"+"\t"+"PRICE");
			System.out.println("=======================================");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
				
			}
			System.out.println("=======================================");
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				stmt.close();
			}
			catch(SQLException e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	public void getProductById() {
		try 
		{
			String getProduct="Select * from product where pid=?";
			pstmt=con.prepareStatement(getProduct);
			System.out.print("Enter Product Id : ");
			int id=sc.nextInt();
			pstmt.setInt(1, id);
			rs=pstmt.executeQuery();
			System.out.println("PID"+"\t"+"NAME"+"\t"+"PRICE");
			System.out.println("=======================================");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
				
			}
			System.out.println("=======================================");
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				pstmt.close();
			}
			catch(SQLException e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	public void updateDataByUsingId() {
		try 
		{
			String updateProduct="update product set price=?,pname=? where pid=?";
			pstmt=con.prepareStatement(updateProduct);
			System.out.print("Enter Product Id : ");
			int id=sc.nextInt();
			pstmt.setInt(3, id);
			System.out.print("Enter Product Price : ");
			float price=sc.nextFloat();
			pstmt.setFloat(1,price);
			System.out.print("Enter Product Name : ");
			sc.nextLine();
			String pname=sc.nextLine();
			pstmt.setString(2, pname);
			
			int psu=pstmt.executeUpdate();
			if(psu!=0)
			{
				System.out.println("Product details updated successfully");
			}
			else
			{
				System.out.println("Product details not updated successfully");
			}
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				pstmt.close();
			}
			catch(SQLException e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	public void deleteProductUsingId() 
	{
	    try 
	    {
	        String deleteProduct = "delete from product where pid = ?";
	        pstmt = con.prepareStatement(deleteProduct);
	        System.out.println("Enter the product id");
	        int id = sc.nextInt();
	        pstmt.setInt(1, id);
	        int i = pstmt.executeUpdate();
	        if(i != 0) {
	            System.out.println("product deleted successfully");
	        }else {
	            System.out.println("product not deleted  successfully");
	        }
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }finally {
	            try {
	                pstmt.close();
	                //rs.close();
	            } catch (SQLException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }

	        }
	}
}
