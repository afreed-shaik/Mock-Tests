package com.ojas.sample;

import java.util.Scanner;

public class EvenNumbersArr {
	
	static void evenNum(int arr[]) {
		
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] % 2 == 0) {
				System.out.println("even numbers are "+ arr[i]);
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of numbers to enter:");
		int num = scan.nextInt();
		int arr[] = new int[num];
		System.out.println("Enter the values into an array:");
		for(int i = 0;i < arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		evenNum(arr);
		
	}

}
