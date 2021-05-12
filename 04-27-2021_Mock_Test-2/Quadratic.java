package com.ojas.sample;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		for(int i = 1;i <= num;i++) {
			rem = i+rem;
			System.out.println(rem);
		}
	}

}
