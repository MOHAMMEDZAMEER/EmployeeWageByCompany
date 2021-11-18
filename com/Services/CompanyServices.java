package com.Services;

import java.util.ArrayList;
import java.util.Scanner;

import com.Employee.ComapanyEmpWage;

public class CompanyServices {
	Scanner scan = new Scanner(System.in);

	public void addCompany() {
		ArrayList<ComapanyEmpWage> temp = EmpWageBuilder.getCompanyList();
		ComapanyEmpWage e = getInfo();
		EmpWageBuilder.computeEmployeeWage(e);
		temp.add(e);
		EmpWageBuilder.setCompanyList(temp);
	}
	
	public void printCompany() {
		
		ArrayList<ComapanyEmpWage> temp = EmpWageBuilder.getCompanyList();
		for (ComapanyEmpWage employee : temp) {
			System.out.println(employee);
		}
	}
	
	public ComapanyEmpWage getInfo() {
		System.out.print("\n\n Please enter the name of the company: ");
		String name = scan.next();
		
		System.out.print(" Please enter the max no of working days in a month: ");
		int no_of_days = scan.nextInt();
		
		System.out.print(" Please enter the max no fo working hours in a month: ");
		int max_hours_in_month = scan.nextInt();
		
		System.out.print(" Please enter the wages per hour: ");
		int wages_per_hour = scan.nextInt();
		
		return new ComapanyEmpWage(name, no_of_days, max_hours_in_month, wages_per_hour);
	}
}