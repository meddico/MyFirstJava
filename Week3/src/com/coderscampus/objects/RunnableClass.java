package com.coderscampus.objects;

import java.util.Random;

public class RunnableClass {

	public static void main(String[] args) {
		
//		// System.out.println("Test");//
//		//Data type, variable name, assignment operation//
//		
////		Random  random = new Random();
////		for (int i=0; i<20; i++) {
////		
////		System.out.println("Random number " + random.nextInt(10));
////		
//		}
		Human someOtherHuman = new Human();

		Human Medhanepage = new Human("male", "5'7\"", "200", "black");
				
				
		System.out.println(Medhanepage.getInfo());
		
		
		Human Johnpage = new Human("male", "5'10\"","178", "blue");
		
			
		
		
		System.out.println(Johnpage.getInfo());
		
		Human selupage = new Human("femal", "5'5\"", "144", "blue");
		
	
		
		
		System.out.println(selupage.getInfo());
		
		
		
		
		
	}

}
