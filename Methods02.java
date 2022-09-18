//METHOD 2 : Program WITH PARAMETER & NO RETURN TYPE

package com.methods;

import java.util.Scanner;

public class Methods02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float a, b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of a = ");
		a = sc.nextFloat();
		System.out.print("Enter value of b = ");
		b = sc.nextFloat();
		
		Methods02 m2 = new Methods02();
		add(a,b);
		sub(a,b);
		mul(a,b);
		m2.div(a,b);
	}

	private void div(float a, float b) {
		// TODO Auto-generated method stub
		
		float c = a / b;
		System.out.println("Division of given values is = " + c);
	}

	private static void mul(float a, float b) {
		// TODO Auto-generated method stub
		
		float c = a * b;
		System.out.println("Multiplication of given values is = " + c);
	}

	private static void sub(float a, float b) {
		// TODO Auto-generated method stub
		
		float c = a - b;
		System.out.println("Substraction of given values is = " + c);
	}

	private static void add(float a, float b) {
		// TODO Auto-generated method stub
		
		float c = a + b;
		System.out.println("Addition of given values is = " + c);
	}

}
