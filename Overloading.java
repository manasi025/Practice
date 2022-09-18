//Program to display simple OVERLOADING technique

package com.oops;

import java.util.Scanner;

class Student
{
	String name;
	int rollNo;
	float percentage;
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name of student : ");
		name = sc.next();
		System.out.print("Enter Roll No. of student : ");
		rollNo = sc.nextInt();
		System.out.print("Enter Percentage of student : ");
		percentage = sc.nextFloat();
	}
	
	void display()
	{
		System.out.print("Name: " + name + "   Roll No.: " + rollNo + "   Percentage: " + percentage);
	}
	
}

public class Overloading 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		s1.input();
		s1.display();
	}

}


/*

OUTPUT :

Enter name of student : ABC
Enter Roll No. of student : 1
Enter Percentage of student : 68
Name: ABC   Roll No.: 1   Percentage: 68.0

*/
