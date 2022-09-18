//Method type 1 : No Parameters & No Return Type

package com.methods;

import java.util.Scanner;

public class NoParameterNoReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NoParameterNoReturnType m1 = new NoParameterNoReturnType();
		areaCircle();
		m1.areaSquare();
		m1.areaTriangle();
		m1.areaRectangle();
	}

	private void areaTriangle() {
		// TODO Auto-generated method stub
		
		float ht = 3, base = 5, area;
		area = (0.5f * ht * base);
		System.out.println("Area of Triangle is = " + area);
	}

	private void areaRectangle() {
		// TODO Auto-generated method stub
		
		float len = 5.2f, breadth = 2, area;
		area = len * breadth;
		System.out.println("Area of Rectangle is = " + area);
	}

	private void areaSquare() {
		// TODO Auto-generated method stub
		
		float len, area;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of Square = ");
		len = sc.nextFloat();
		area = len * len;
		System.out.println("Area of Square is = " + area);
	}

	static void areaCircle() {
		// TODO Auto-generated method stub
		
		float r = 0, area;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius of Circle = ");
		r = sc.nextFloat();
		area = (3.14f * r * r);
		System.out.println("Area of Circle is = " + area);
	}

}
