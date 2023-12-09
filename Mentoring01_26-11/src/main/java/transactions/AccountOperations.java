package transactions;

import java.util.Random;
import java.util.Scanner;

import useroperations.OTP;

public class AccountOperations {

	private int accountBalance;
	public AccountOperations(int balance) {
		this.accountBalance = balance;
	}
	
	public int balanceCheck() {
		System.out.println("Current balance in the account is: "+this.accountBalance);
		return accountBalance;
	}
	
	public int depositMoney(int toDeposit) {
		accountBalance = accountBalance + toDeposit;
		System.out.println("Amount deposited successfully");
		this.balanceCheck();
		return accountBalance;
	}
	
	public int withdrawMoney(int toWithdraw) {
		if(toWithdraw <= accountBalance) {
			accountBalance = accountBalance - toWithdraw;
			System.out.println("Amount withdrawn successfully. Account balance is now "+accountBalance);
		}else {
			System.out.println("Insufficient account balance.");
		}
		return accountBalance;
	}
	
	public int transferMoney(int toTransfer) {
		if(toTransfer <= accountBalance) {
			OTP otpObj = new OTP();
			int otp = otpObj.generateOTP();
			System.out.println("Please enter the OTP received.");
			Scanner sc = new Scanner(System.in);
			int userInput = sc.nextInt();
			if(otpObj.validateOTP(otp, userInput)) {
				accountBalance -= toTransfer;
				System.out.println("Amount transferred successfully. Account balance is now "+accountBalance);
			}else {
				System.out.println("Wrong OTP entered.");
			}
		}else {
			System.out.println("Insufficient account balance.");
		}
		return accountBalance;
	}
	
}
