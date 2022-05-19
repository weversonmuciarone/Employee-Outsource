package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		
		List<Employee> list = new ArrayList<>();
		
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.print("Employee #" + i + "data: ");
			System.out.print("Outsourced (Y/N)? ");
			char ch = sc.next().charAt(0);	
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			if(ch == 'y') {
				System.out.print("Additional Charge: ");
				double additionalCharge = sc.nextDouble();
				
				/*Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(emp);*/ // Employee instanciated above and Clean code below
				
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			}
			else {
				/*Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);*/ //Clean code below
				
				list.add(new Employee(name, hours, valuePerHour));
			}
		
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		for(Employee emp : list) {
			System.out.println(emp.getName() + " - £ " + String.format("%.2f",emp.payment()));
		}
		
		sc.close();
	}

}
