package com.ojas.sample;

import java.util.Scanner;

public class MaskMailId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mail id:");
		String str = sc.next();
		maskMailID(str);
	}
	static void maskMailID(String email) {
		int count = 0;
		char[] c1 = email.toCharArray();
		for (int i = 0; i < c1.length; i++) {
			if (email.charAt(i) == '@') {
				count = i;
		}
		}
		for (int i = 2; i < count; i++) {
			c1[i] = 'X';
		}
		System.out.println(toString(c1));
		}
		private static String toString(char[] c1) {
			String str = new String(c1);
			return str;
	}

}
