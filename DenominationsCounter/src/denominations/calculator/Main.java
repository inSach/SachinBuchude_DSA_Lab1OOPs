package denominations.calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Integer[] denominations;
		int paymentAmount;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of currency denominations ");
		Integer denominationsSize = input.nextInt();
		denominations = new Integer[denominationsSize];
		for (int index = 0; index < denominationsSize; index ++) {
			System.out.printf("Enter denomination value : %d / %d", (index + 1), denominationsSize);
			System.out.println();
			denominations[index] = input.nextInt();
		}
		System.out.println("Enter the payment amount : ");
		paymentAmount = input.nextInt();
		DenominationsCalculator calculator = new DenominationsCalculator(denominations, paymentAmount);
		calculator.calculate();
	}
	
}
