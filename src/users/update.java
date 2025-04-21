package users;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class update{
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
			String name="update  " + sc.next()+"  set name=?,email=? where id=?";
			PreparedStatement pmst= cn.prepareStatement(name);
			
			System.out.println("enter name");
			pmst.setString(1,sc.next());
			System.out.println("enter email");
			pmst.setString(2,sc.next());
			System.out.println("enter id");
			pmst.setInt(3,sc.nextInt());
			int i=pmst.executeUpdate();
	
			if (i>0) {
				System.out.println("data is updated");
			}
			else {
				System.out.println("data is not updated");
			}
			
			cn.close();
			pmst.close();
			
					
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}


	}
 