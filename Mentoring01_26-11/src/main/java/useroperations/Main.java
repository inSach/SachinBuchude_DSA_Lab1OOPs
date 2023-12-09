package useroperations;

import java.util.Scanner;

import transactions.AccountOperations;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Account Number");
		int userAccNumber = sc.nextInt();
		
		System.out.println("Please enter Password");
		String userPwd = sc.next();
		
		LoginManagement loginMgmt = new LoginManagement();
		loginMgmt.setAccountNumber(userAccNumber);
		boolean isUserLoggedIn = loginMgmt.signInUser(userAccNumber, userPwd);
		
		AccountOperations accOps = new AccountOperations(5000);
		
		while (isUserLoggedIn) {
			System.out.println("Select operation to perform."
					+ "\n 1. Check balance "
					+ "\n 2. Deposit "
					+ "\n 3. Withdrawl "
					+ "\n 4. Transfer "
					+ "\n 5. Logout");
			
			int operationId = sc.nextInt();
			
			switch (operationId) {
			case 1:
				int balance = accOps.balanceCheck();
//				System.out.println("Your account balance is: " + balance);
				break;

			case 2:
				int toDeposit = 0;
				do {
					System.out.println("Please input amount to deposit.");
					toDeposit = sc.nextInt();
				}while(toDeposit <= 0);
				accOps.depositMoney(toDeposit);
				break;

			case 3:
				int toWithdraw = 0;
				do {
					System.out.println("Please input amount to withdraw.");
					toWithdraw = sc.nextInt();
				}while(toWithdraw <= 0);
				accOps.withdrawMoney(toWithdraw);
				break;

			case 4:
				int toTransfer = 0;
				do {
					System.out.println("Please input amount to transfer.");
					toTransfer = sc.nextInt();
				}while(toTransfer <= 0);
				accOps.transferMoney(toTransfer);
				break;

			case 5:
				isUserLoggedIn = loginMgmt.logout();
				sc.close();
				break;
				
			default:
				System.out.println("Please input correct option");
				break;
			}
		}
		
		
	}
	
}
