//METHOD 4 : NO PARAMETERES & WITH RETURN TYPE

package com.methods;

import java.util.Scanner;

public class Methods04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c;
		c = add();
		System.out.print("Addition is : " + c);
	}

	private static int add() {
		// TODO Auto-generated method stub
		
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter values for a : ");
		a = sc.nextInt();
		System.out.print("Enter values for b : ");
		b = sc.nextInt();
		c = a + b;
		return c;
	}

}
