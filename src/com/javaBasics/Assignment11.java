package com.javaBasics;

import java.util.Scanner;

public class Assignment11 
{
	//Write a Java program to perform basic Calculator operations.
	public static void main(String[] args) 
	{
		double num1, num2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter First value");
		 num1 = scanner.nextDouble();
		
		System.out.println("Enter an Operator : ( +, -, *, / )");
		char operator = scanner.next().charAt(0);
		
		System.out.println("Enter Second value");
		 num2 = scanner.nextDouble();
		 
        double result = 0; // stores the result
        
        switch(operator)
     {
        case'+':
        	result = num1 + num2;
        	break;
        case '-':
        	result = num1 - num2;
        	break;
        case '*':
        	result = num1 * num2;
        	break;
        case '/':
        	if (num2 == 0 )// division by zero N.D
        	{
        		System.out.println("Error Divison by 0 is N.D");
        	}
        	else
        	{
        		result = num1 / num2;
        	}
        	break;
        	
        	default:
        		System.out.println("Error");
       }

	     System.out.println("\n Result = " +result );// returns result for operation performed on the numbers 
	     
	     scanner.close();	
	}

}
