package com.javaBasics;

import java.util.Scanner;

public class Assignment4 
{
    //Write a Java program that reads a number in inches and converts it to meters
	public static void main(String[] args) 
	{

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter value in inches :");
		double value = scanner.nextDouble();
		
		scanner.close();
		
		double meters = value*0.0254;// conversion from inches to meters
		
		System.out.println("The given value in Meters = "+ meters);//prints values in meters
		
		
	}

}
