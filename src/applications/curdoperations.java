package applications;

import java.util.Scanner;

public class curdoperations {
	public static void main(String[] args) {
		//do while,switch,jdbc,execption handling
		int a;
		
		do {
			System.out.println("curd operations");
			System.out.println("**********");
            Display();
			Scanner sc=new Scanner(System.in);
			System.out.println("enter ur choice :");
			a=Integer.parseInt(sc.next());
			switch(a) {
			case 1:
				createdatabase();
				
				break;
			case 0:
				default:
					System.out.println("invalid");
					break;
				case 2:
					dropdatabase();
					break;
					
				
					
					
				case 3:
					createtable();
					break;
					
				case 4:
					droptable();
					
				case 5:
					insertion();
					
				case 6:
					deletion();
					break;
					
					
					
				case 7:
					getall();
					break;
					
					
				case 8:
					getbyemail();
					break;
					
				case 9:
				   update();
					break;
					
				case 10:
					System.out.println();
					break;
					
					
			}
		} while (a>0);
	}

	private static void getbyemail() {
		// TODO Auto-generated method stub
		
	}

	private static void getall() {
		// TODO Auto-generated method stub
		
	}

	private static void update() {
		// TODO Auto-generated method stub
		
	}

	private static void deletion() {
		// TODO Auto-generated method stub
		
	}

	private static void insertion() {
		// TODO Auto-generated method stub
		
	}

	private static void droptable() {
		// TODO Auto-generated method stub
		
	}

	private static void createtable() {
		// TODO Auto-generated method stub
		
	}

	private static void dropdatabase() {
		// TODO Auto-generated method stub
		
	}

	private static void createdatabase() {
		System.out.println("database1");
		// TODO Auto-generated method stub
		
	}

	private static void Display() {
		// TODO Auto-generated method stub
		System.out.println("\t1.create database");
		System.out.println("\t2.drop database");
		System.out.println("\t3.create table");
		System.out.println("\t4.drop table");
		System.out.println("\t5.Insertion");
		System.out.println("\t6.update");
		System.out.println("\t7.Delete");
		System.out.println("\t8.getall");
		System.out.println("\t9.getbyemail");
		System.out.println("\t10.Exit");
		
	}

}
