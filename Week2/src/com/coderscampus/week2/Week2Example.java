package com.coderscampus.week2;

import java.util.Scanner;

public class Week2Example {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type in your name:");
		String name = scanner.nextLine();
		System.out.println("Type in your age");
		String age = scanner.nextLine();
		
		if(name.equals("Medhane") 
				&& age.equals("36"))
		{
			System.out.println("yeah it is you!");
		} else {
			System.out.println("Hello: " + name);
		}
		
		
		scanner.close();
		
		
	}
		
		 
		  
		  
	}

