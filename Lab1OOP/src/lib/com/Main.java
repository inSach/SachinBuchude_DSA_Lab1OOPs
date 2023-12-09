package lib.com;

import java.io.Console;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		String addNew = "y";
		Scanner sc = new Scanner(System.in);
		while(addNew.equals("y")) {
			System.out.println("Enter First name of employee");
			String empFirstName = sc.next().trim();
			
			System.out.println("Enter Last name of employee");
			String empLastName = sc.next().trim();
			
			System.out.println("Please select Department code of employee. \n 1. Technical \n 2. Admin \n 3. Human Resource \n 4. Legal");
			int departmentCode = sc.nextInt();
			
			Employee empObj = new Employee(empFirstName, empLastName, departmentCode);
			
			CredentialSrvc credentialSrvc = new CredentialSrvc(empObj);
			
			credentialSrvc.showCredentials();
			
			System.out.println("Do you want to continue adding next employee ? (y / n)");
			addNew = sc.next().toLowerCase();
		}
		sc.close();
	}
	
}
