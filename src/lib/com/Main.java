package lib.com;

import java.io.Console;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First name of employee");
		String empFirstName = sc.nextLine();
		
		System.out.println("Enter Last name of employee");
		String empLastName = sc.nextLine();
		
		System.out.println("Please select Department code of employee. \n 1. Technical \n 2. Admin \n 3. Human Resource \n 4. Legal");
		int departmentCode = sc.nextInt();
		Organization objOrg = new Organization(departmentCode);
		
		Employee empObj = new Employee(empFirstName, empLastName, objOrg);
		
		CredentialSrvc credentialSrvc = new CredentialSrvc(empObj);
		
		credentialSrvc.showCredentials();
	}
	
}
