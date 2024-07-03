package com.javaBasics;

import java.util.Scanner;

public class Assignment5 
{
    //Write a Java program to convert minutes into years and days.
	public static void main(String[] args)
	{

        Scanner scanner = new Scanner(System.in);

        // enter the number of minutes
        System.out.print("Enter the number of minutes: ");
        long minutes = scanner.nextLong();

        // Calculate the number of years and days
        long minutesInYear = 60*24*365;// 525600 minutes in a year
        
        long minutesInDay = 60*24;//1440 minutes in a day
        
        long years = minutes / minutesInYear;// conversion of minutes into year
        long days = minutes /minutesInDay;// conversion of minutes into day


        System.out.println("Given minutes in Years= "+years);
        
        System.out.println("Given minutes in Days= "+days);

        scanner.close();
    
	}

}
