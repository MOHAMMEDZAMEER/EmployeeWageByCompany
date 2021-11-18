package com.Services;

import java.util.ArrayList;
import java.util.Scanner;

import com.Employee.ComapanyEmpWage;

public class EmpWageBuilder {

private static ArrayList<ComapanyEmpWage> CompanyList = new ArrayList<ComapanyEmpWage>();
Scanner scan = new Scanner(System.in);

public static ArrayList<ComapanyEmpWage> getCompanyList() {
	return CompanyList;
}

public static void setCompanyList(ArrayList<ComapanyEmpWage> companyList) {
	CompanyList = companyList;
}

public static void computeEmployeeWage(ComapanyEmpWage e) {	
	
	final int IS_PART_TIME = 1;
	final int IS_FULL_TIME = 2;
	final int PART_TIME_HOURS = 4;
	final int FULL_TIME_HOURS = 8;	
	
	int days = 0;
	int hours = 0;
	
	String name = e.getName();
	int no_of_days = e.getDays();
	int max_hours_in_month = e.getHours();
	int wages_per_hour = e.getWage();
	
	while (days < no_of_days && hours < max_hours_in_month) {
		
		int attendance = (int)Math.floor( (Math.random() * 10) % 3);
		
		if (hours + PART_TIME_HOURS > max_hours_in_month && hours + FULL_TIME_HOURS > max_hours_in_month) {
			break;
		}
		
		switch (attendance) {
		case 0:
			break;
			
		case IS_PART_TIME: 
				if (hours + PART_TIME_HOURS > max_hours_in_month) {
					break;
				}
				hours += PART_TIME_HOURS;
				days++;
				break;
		case IS_FULL_TIME:
				if (hours + FULL_TIME_HOURS > max_hours_in_month) {
					break;
				}
				hours += FULL_TIME_HOURS;
				days++;
				break;				
		}
	}
	
	e.setDays(days);
	e.setHours(hours);
	e.setWage(hours * wages_per_hour);
	System.out.println(e);
}
}