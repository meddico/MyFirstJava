package com.coderscampus.objects;

public class Human {

		String gender;
		String height;
		String weight;
		String eyecolor;
		
			
		Human(){
			
			System.out.println("A human is being created");
		}
			
			Human (String gender, String height, String weight, String eyecolor){
			
			
			this.gender = gender;
			this.height = height;
			this.weight = weight;
			this.eyecolor = eyecolor;
		}
		
		
			
	
	String getInfo ( ) {
		return "Gender: " + gender + ",  Height: " + height + 
				", Weight: " + weight + ", Eyecolor: " + eyecolor;
		
	}
		
	
				
	

}
