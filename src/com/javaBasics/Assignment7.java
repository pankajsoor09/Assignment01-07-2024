package com.javaBasics;

public class Assignment7 
{
     //Write a Java program to find the number of days in a month.
	public static void main(String[] args)
	
	{  
		String month = "FEBRUARY".toLowerCase();
		
		String output = switch(month)
	{
		case "january","march","may","july","august","october","december" -> "31 Days";
		case "april","june","september","november" -> "30 Days";
		case "february" -> "28 Days and if leap year 29 Days";
		
		default -> "Enter valid Month";
	};
	System.out.println(output);
	}

}
