package com.javaBasics;

import java.util.Scanner;

public class Assignment1
{
    //Write a Java program to print the area and perimeter of a rectangle
	public static void main(String[] args) 
	{
         Scanner scanner = new Scanner(System.in);
         
         System.out.println("Enter the length of rectangle :");
          int l = scanner.nextInt();
          
          System.out.println("Enter the width of rectangle :");
          int w = scanner.nextInt();
          
          int area = l*w , perimeter = 2*(l+w);// l = length , w = width
          
          System.out.println("Area of rectangle is :"+area +"\n");
          System.out.println("Perimeter of rectangle is :"+perimeter);
          
          scanner.close();
	}

}
 