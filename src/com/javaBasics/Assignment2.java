package com.javaBasics;

import java.util.Scanner;

public class Assignment2
{
    //Write a Java program to print the area of a triangle
	public static void main(String[] args)
	{
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Enter the base of triangle");
       int b = scanner.nextInt();
       
       System.out.println("Enter the height of triangle");
       int h = scanner.nextInt();
       
       int area = b*h/2; //b = base of triangle , h = height of triangle
       
       System.out.println("Area of triangle is :"+area);
       
       scanner.close();
	}

}
