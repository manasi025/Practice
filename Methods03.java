//METHOD 3 : WITH PARAMETERS & WITH RETURN TYPE

package com.methods;

import java.util.Scanner;

public class Methods03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value for a : ");
		a = sc.nextInt();
		System.out.print("Enter value for b : ");
		b = sc.nextInt();
		c = sub(a, b);
 		System.out.print("Substraction is : " + c);
	}

	private static int sub(int a, int b) {
		// TODO Auto-generated method stub
		
		int c;
		c = a - b;
		return c;
	}


}
