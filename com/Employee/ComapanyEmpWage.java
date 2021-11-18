package com.Employee;
import java.util.ArrayList;

import com.Services.EmpWageBuilder;

public class ComapanyEmpWage {
	private int wage = 0;    
	private int days = 0;    
	private int hours = 0;   
	private String name;
	
	public ComapanyEmpWage(String name, int days, int hours, int wage ) {
		super();
		this.wage = wage;
		this.days = days;
		this.hours = hours;
		this.name = name;
	}
	public int getWage() {
		return wage;
	}

	public void setWage(int wage) {
		this.wage = wage;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {		
		System.out.println("\n ==== " + name + " ====");
		System.out.println(" Total wages earned = " + wage);
		System.out.println(" Total working days = " + days);
		System.out.print(" Total working hours = " + hours);	
		return "";
	}
	
	

}