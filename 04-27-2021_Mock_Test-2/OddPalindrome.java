package com.ojas.sample;

import java.util.Scanner;

public class OddPalindrome {
	public static int dispNumber(int start,int end) {
		int rev = 0;
		int num;
		for(num = start;num <= end;num++) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if(rev == start) {
			if(rev % 2 != 0) {
				System.out.println(rev);
			}	
		}
		return rev;
		
		}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Starting and end number");
		int start = sc.nextInt();
		int end = sc.nextInt();
		System.out.println(dispNumber(start, end));
	}
}
