package com.ojas.sample;

import java.util.Scanner;

public class PrimeNumber {

	static void givenNumber(int num) {
		int count = 0;
		if(num % 2 == 0) {
			count++;
		}
		if(count == 1) {
			System.out.println("Given number is not a prime number");
		}
		else
			System.out.println("Given number is prime number");
		
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = sc.nextInt();
	givenNumber(num);
		
	}

}
