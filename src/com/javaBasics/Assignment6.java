package com.javaBasics;

import java.util.Scanner;

public class Assignment6
{
     //Write a Java program that takes three numbers from the user and prints the greatest number
	public static void main(String[] args) 
	{
		int  num1, num2, num3;
		
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Enter the first number");
      num1= scanner.nextInt();
      
      System.out.println("Enter the second number");
      num2= scanner.nextInt();
      
      System.out.println("Enter the third number");
      num3= scanner.nextInt();
      
      // Compare three number to get the greatest number
      if(num1>num2 && num1>num3) 
      {
       System.out.println("The greatest number = "+num1);
      }
      if(num2>num1 && num2>num3)
      {
    	  System.out.println("The greatest number = "+num2);
      }
      
      if(num3>num1 && num3>num2)
      {
    	  System.out.println("The greatest number = "+num3);
      }
      
      scanner.close();
	}

}
