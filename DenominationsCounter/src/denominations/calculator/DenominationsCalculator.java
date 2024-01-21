package denominations.calculator;

import java.util.Arrays;

import merge.sort.MergeSort;

public class DenominationsCalculator{
	
	private Integer[] denominations;
	private int paymentAmount;
	
	public DenominationsCalculator (Integer[] denominations, int paymentAmount) {
		this.denominations = denominations;
		this.paymentAmount = paymentAmount;
	}
	
	private void sortDenominations() {
		MergeSort sorter = new MergeSort(denominations);
		sorter.mergeSort();
		System.out.println("Sorted array " + Arrays.toString(denominations));
	}
	
	public void calculate() {
		sortDenominations();
		int denominationIndex = 0;
		int workingPaymentAmount = paymentAmount;
		while (denominationIndex < denominations.length) {
			int denomination = denominations[denominationIndex];
			int noOfDenominations = workingPaymentAmount / denomination;
			//balance amount
			int balanceAmount = workingPaymentAmount % denomination;
			//can use denomination or not
			if(noOfDenominations != 0) {
				System.out.printf("Denomination value : %d , Count : %d ", denomination, noOfDenominations);
			}
			workingPaymentAmount = balanceAmount;
			if(workingPaymentAmount == 0) {
				break;
			}
			denominationIndex++;
		}
		if(workingPaymentAmount != 0) {
			System.out.println("Unable to provide the exact denominations");
			System.out.println("Remaining amount : " + workingPaymentAmount);
		}
	}
}