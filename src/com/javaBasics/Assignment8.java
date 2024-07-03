package com.javaBasics;

import java.util.Scanner;

public class Assignment8
{
    //Write a Java program that takes a year from the user and prints whether it is a leap year or not.
	public static void main(String[] args) 
	{
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Enter the year");
       int year = scanner.nextInt();
       
       if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
    	   /**
    	    * year = 1800
    	    * ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
    	    *           (True &&    False) || False --> False||False --> False so it will go to else.
    	    *  year =2024
    	    *  (True && True)||False --> True||False --> True so if will be printed
    	    */
       {
    	   System.out.println("It is a leap year");
       }
       else 
       {
    	   System.out.println("It is not a leap year");
       }
       scanner.close();
	}

}
