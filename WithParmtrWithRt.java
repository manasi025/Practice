//Program using Method03 : with Parameters & with Return Type

package com.methods;

import java.util.Scanner;

public class WithParmtrWithRt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, add, sub, mul, div;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter values for a and b : ");
		a = sc.nextInt();
		b = sc.nextInt();
		add = addition(a, b);
		System.out.print("Addition is : " + add);
		sub = substraction(a, b);
		System.out.print("\nSubstraction is : " + sub);
		mul = multiplication(a, b);
		System.out.print("\nMultiplication is : " + mul);
		div = division(a, b);
		System.out.print("\nDivision is : " + div);
	}

	private static int division(int a, int b) {
		// TODO Auto-generated method stub
		
		int div;
		div = a / b;
		return div;
	}

	private static int multiplication(int a, int b) {
		// TODO Auto-generated method stub
		
		int mul;
		mul = a * b;
		return mul;
	}

	private static int substraction(int a, int b) {
		// TODO Auto-generated method stub
		
		int sub;
		sub = a - b;
		return sub;
	}

	private static int addition(int a, int b) {
		// TODO Auto-generated method stub
		
		int add;
		add = a + b;
		return add;
	}

}
