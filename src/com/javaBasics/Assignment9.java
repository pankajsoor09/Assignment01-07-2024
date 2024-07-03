package com.javaBasics;

import java.util.Scanner;

public class Assignment9
{

	/*Write a Java program to Calculate Simple Interest for a given amount,
	    * rate of interest and time duration.*/
	
	public static void main(String[] args)
	{
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Enter the Principal( initially borrowed amount) ");
       int p = scanner.nextInt();// P = Principal( initially borrowed amount)
       
       System.out.println("Enter the Rate of Interest");
       float r = scanner.nextFloat();//R = Rate of Interest in % per annum
       
       System.out.println("Enter the Time (in years)");
       int t = scanner.nextInt();//T = Time
       
       float simpleInterest = p*r*t/100; 
       
       scanner.close();
       
       System.out.println(simpleInterest);
       }
}
