package com.prework;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Customer Name: ");
		String name = sc.nextLine();
		System.out.println("Please enter Customer Age: ");
		int age = sc.nextInt();
		sc.close();
		
		customer.customerDetails(name, age);
	}
}
