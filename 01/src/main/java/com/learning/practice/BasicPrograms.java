package com.learning.practice;

public class BasicPrograms {

	public static void main(String[] args) {
		
		BasicPrograms obj = new BasicPrograms();
		obj.sum(1, 2);
		obj.sum(1, -1);
		obj.sum(1, -2);
	}
	
	public void sum(int a, int b) {
		int result = a + b;
		System.out.println(String.format("Addition of number a %d and number b %d is %d", a, b, result));
	}
	
}
