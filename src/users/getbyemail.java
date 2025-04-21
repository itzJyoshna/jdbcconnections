package users;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class getbyemail{
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
			String name="select * from  " + sc.next() + " where email=?";
			PreparedStatement pmst= cn.prepareStatement(name);
			System.out.println("enter email :");
			pmst.setString(1, sc.next());
		ResultSet jyo=	pmst.executeQuery();
		
		while(jyo.next()) {
			System.out.println( "**********");
			
			System.out.println( "ID:" + jyo.getInt("id"));
			System.out.println( "NAME:" + jyo.getString("name"));
			System.out.println( "EMAIL:" + jyo.getString("email"));
			System.out.println( "**********");
			
			
			
			
		}
			
			cn.close();
			pmst.close();
			
					
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}


	}
 