package users;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class delete{
	private static final String DRIVER="com.mysql.cj.jdbc.Driver";
	
	private static final String USERNAME="root";
	private static final String PASSWORD="root1";
	public static void main(String[] args) {
		
	
		
		try {
			//1.load driver
			//in class class c should be capital
			//msql Driver name com.mysql.cj.jdbc.Driver
			Scanner sc =new Scanner(System.in);
			System.out.println("provide database name:");
			String URl ="jdbc:mysql://localhost:3306/"+sc.next();
			
			Class.forName(DRIVER);
			Connection  cn =DriverManager.getConnection(URl, USERNAME, PASSWORD);
			System.out.println("enter the table name:");
			String name="delete from  " + sc.next()+"where id=?";
			PreparedStatement pmst= cn.prepareStatement(name);
			
			System.out.println("enter id:");
			pmst.setInt(1,sc.nextInt());
			int i=pmst.executeUpdate();
	
			if (i==0) {
				System.out.println("data is jyo deleted");
			}
			else {
				System.out.println("data is not deleted");
			}
			
			cn.close();
			pmst.close();
			
					
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}


	}
 