package com.ojas.sample;

import java.util.Scanner;

public class StringPalindrome {
	public static void givenName(String str) {
		String rem = "";
		for(int num = str.length()-1;num >= 0;num--) {
			rem = rem+str.charAt(num);
		}
		if(rem == str) {
			System.out.println("Given name is palindrome");
		}
		else
			System.out.println("Given name is not Palindrome");
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name:");
		String str = sc.next();
		givenName(str);
		
	}
}
