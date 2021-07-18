package com.coderscampus.objects;

public class RunnableClass {

	public static void main(String[] args) {
		
		// System.out.println("Test");//
		//Data type, variable name, assignment operation//
		
		Human Medhanepage = new Human();
		
		Medhanepage.setProperties("male", "5'7\"", "200", "black");
		
		
		System.out.println(Medhanepage.getInfo());
		
		
		Human Johnpage = new Human();
		
			
		Johnpage.setProperties("male", "5'10\"","178", "blue");
		
		
		System.out.println(Johnpage.getInfo());
		
		Human selupage = new Human();
		
		selupage.eyecolor = "blue";
		selupage.gender = "female";
		selupage.height = "5.5\"";
		selupage.weight = "144";
		
		System.out.println(selupage.getInfo());
		
		
		
		
		
	}

}
