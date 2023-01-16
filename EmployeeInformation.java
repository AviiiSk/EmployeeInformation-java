package com.assignment8.employee.student.details;

import java.util.Scanner;

public class EmployeeInformation {
	
	
	@SuppressWarnings({ "unused", "resource" })
	public void getUserInput()
	{
		Employee emp = new Employee();
		
		Scanner scanner = new Scanner(System.in); // creating scanner class for user input
		
		System.out.println("Enter the First Name :" ); 
		emp.firstName = scanner.next();  // here take the First Name from the user.
		
		System.out.println("Enter the Last Name :");
		emp.lastName = scanner.next();  // here take the Last Name from the user.
		
		System.out.println("Enter the City Name :");
		emp.city = scanner.next();     // here take the City name from the user.
		
		System.out.println("Enter the Mobile Number :");
		emp.mobileNumber = scanner.nextLong(); // here take the Mobile Number from the user.
		
		
		getStudentInformation(emp.firstName,emp.lastName,emp.city,emp.mobileNumber,Employee.country);
		 // pass the information through the method.
		
		
	}

	public void getStudentInformation(String firstName, String lastName, String city, long mobileNumber,
			String country) {
		
		// method used to get student details.
		
		
		System.out.println("Your Student Details");
		System.out.println("First Name : " + firstName);
		System.out.println("Last Name : " + lastName);
		System.out.println("City Name : " + city);
		System.out.println("Mobile Number : " + mobileNumber);
		System.out.println("Country : " + country);
		
	}




	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		
		
		EmployeeInformation employeeInformation = new EmployeeInformation(); // creating the object of Employee information class
		
		System.out.println("Enter the Student Count for information");
		
		Scanner enter = new Scanner(System.in);
		
		int multi = enter.nextInt();
		
		
		for(int i = 1; i<=multi ; i++)
		{
			
			System.out.println("Enter the Student Details");
			
			employeeInformation.getUserInput();
			
		}
		
		

	}

}
