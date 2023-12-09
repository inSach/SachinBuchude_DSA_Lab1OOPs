package useroperations;

import java.util.Scanner;

public class LoginManagement {
	
	private int accountNumber;
	private String pwd = "pwd";
	
	public void setAccountNumber(int accNumber) {
		this.accountNumber = accNumber;
	}
	
	public int getAccountNumber() {
		return this.accountNumber;
	}
	
	public boolean signInUser(int userAccNumber, String userPwd) {
		boolean userLoggedin = false;
		if(userAccNumber == accountNumber && userPwd.equals(pwd)) {
			System.out.println("Welcome... You are successfully logged in to your account!");
			userLoggedin = true;
		}else {
			System.out.println("Invalid Account number and Password.");
		}
		return userLoggedin;
	}
	
	public boolean logout() {
		System.out.println("User logged out successfully...");
		return false;
	}
}
