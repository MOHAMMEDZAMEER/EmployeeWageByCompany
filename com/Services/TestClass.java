package com.Services;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean loop = true;
		int ch;
		
		CompanyServices obj = new CompanyServices();
		
		while (loop) {
			System.out.println("\n ======== ");
			System.out.println(" 1. Add company\n 2. Print Employee Details\n 3. Exit");
			System.out.print(" Please enter your choice: ");
			ch = scan.nextInt();
			
			switch(ch) {
			case 1:
				obj.addCompany();
				break;
			case 2:
				obj.printCompany();
				break;
			case 3:
				return;
			default: 
				System.out.println(" Please enter valid input");
				break;
			}
		}
		
		scan.close();		
	}

}