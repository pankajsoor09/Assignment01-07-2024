package com.javaBasics;

import java.util.Scanner;

public class Assignment3
{
    //Write a Java program to swap two variables
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Assign value for variable  A = ");
		int a = scanner.nextInt();
		
		System.out.println("Assign value for variable  B = ");
		int b = scanner.nextInt();
		
		scanner.close();
		//prints the original variable
		System.out.println("Before swapping the variable");
		
		System.out.println("A = "+a);
		System.out.println("B = "+b);
		
		int c=a; // swapping of variables
		    a=b;
		    b=c;
		    
		    // prints swapped variables
			System.out.println("After swapping the variable");
			
			System.out.println("A = "+a);
			System.out.println("B = "+b);

		    }
		}


