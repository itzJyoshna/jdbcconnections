package users;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class drop {
	private static final String DRIVER="com.mysql.cj.jdbc.Driver";
	private static final String URL="jdbc:mysql://localhost:3306/";
	private static final String USERNAME="root";
	private static final String PASSWORD="root1";
	public static void main(String[] args) {
		
	
		
		try {
			//1.load driver
			//in class class c should be capital
			//msql Driver name com.mysql.cj.jdbc.Driver
			Scanner sc =new Scanner(System.in);
			Class.forName(DRIVER);
			Connection  cn =DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("enter the datbase name:");
			String name="drop database  " + sc.next();
			PreparedStatement pmst= cn.prepareStatement(name);
			int i=pmst.executeUpdate();
	
			if (i>0) {
				System.out.println("database is dropped");
			}
			else {
				System.out.println("database is not dropped");
			}
			
			cn.close();
			pmst.close();
			
					
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}


	}
 