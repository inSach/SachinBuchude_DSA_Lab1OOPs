package paymoney.tgt.determinator;

import java.util.Scanner;

public class PaymoneyTargetDeterminator {
	
	Integer [] transactionList;
	Scanner input;
	 int dailyTarget;
	
	public PaymoneyTargetDeterminator() {
		input = new Scanner(System.in);
	}
	
	private void acceptTransactionList() {
		System.out.println("Please enter number of transactions.");
		int transactionsCnt = input.nextInt();
		transactionList = new Integer[transactionsCnt];
		int i = 0;
		while(i < transactionsCnt) {
			System.out.println(String.format("Please enter transaction value : %d of %d", i+1, transactionsCnt));
			transactionList[i] = input.nextInt();
			i++;
		}
	}
	
	private void acceptDailyTarget() {
		System.out.println("Daily Target...");
		System.out.println("Enter value for Daily target: ");
		dailyTarget = input.nextInt();
	}
	
	public void determine() {
		acceptTransactionList();
		acceptDailyTarget();
	}
	
	public void determineTarget() {
		determine();
		boolean targetAchieved = false;
		int sumOfTransactions = 0;
		int transactionsCnt = 0;
		for(int i=0; i< transactionList.length; i++) {
			sumOfTransactions = sumOfTransactions + transactionList[i];
			System.out.println(String.format("Sum of Transactions is %d after %d transactions.", sumOfTransactions, i+1));
			if(sumOfTransactions >= dailyTarget) {
				targetAchieved = true;
				transactionsCnt = i+1;
				break;
			}
		}
		if(targetAchieved) {
			System.out.println(String.format("Daily Target %d achieved after %d transactions.", dailyTarget, transactionsCnt));
		}else {
			System.out.println(String.format("Can not achieve Daily target of %d after all %d transactions.", dailyTarget, transactionList.length ));
		}
	}
	
}
