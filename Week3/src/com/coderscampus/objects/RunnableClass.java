package com.coderscampus.objects;

public class RunnableClass {

	public static void main(String[] args) {
		
		// System.out.println("Test");//
		//Data type, variable name, assignment operation//
		
		Human Medhanepage = new Human();
		
		
		Medhanepage.eyecolor = "black";
		Medhanepage.gender = "male";
		Medhanepage.height = "5'7\"";
		Medhanepage.weight = "200";
		
		System.out.println(Medhanepage.getInfo());
		
		
		Human Johnpage = new Human();
		
		Johnpage.eyecolor = "blue";
		Johnpage.gender = "male";
		Johnpage.height = "5'10\"";
		Johnpage.weight = "178";
		
		System.out.println(Johnpage.getInfo());
		
		Human selupage = new Human();
		
		selupage.eyecolor = "blue";
		selupage.gender = " female";
		selupage.height = "5.5\"";
		selupage.weight = "144";
		
		System.out.println(selupage.getInfo());
		
		
		
		
		
	}

}
