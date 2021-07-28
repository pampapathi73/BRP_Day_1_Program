package com.bridgelabz.BRP.Day1;

/*
 *  1.Write a program “ PrintThreeNames.java ” that takes three names as input and prints out a proper sentence with the names in the reverse of the order given, so
 *   " java PrintThreeNames Alice Bob Carol " gives "Hi Carol, Bob,and Alice.".
 */

import java.util.Scanner;
public class PrintThreeNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 3 names");
		String s1,s2,s3;
		Scanner sc=new Scanner(System.in);
		s1=sc.nextLine();
		s2=sc.nextLine();
		s3=sc.nextLine();
		System.out.println("Hi "+s3+" ,"+s2+" and "+s1);

	}

}
