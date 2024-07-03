package com.javaBasics;

import java.util.Scanner;

public class Assignment12
{
    //Write a simple Java program to calculate a Factorial of a number.
	public static void main(String[] args)
	{
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Enter a number");
      int n = scanner.nextInt();
      
        int factorial = 1;// Initialize the variable to hold the factorial result

      for (int i = 1; i <= n; i++) // Calculate the factorial using a for loop
      {
    	  factorial = factorial * i; 
      }
          
      System.out.println("Factorial of "+n+" = "+factorial);
      
      scanner.close();
	}

}
