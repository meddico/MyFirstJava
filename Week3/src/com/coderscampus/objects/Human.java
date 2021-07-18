package com.coderscampus.objects;

public class Human {

	

		String gender;
		String height;
		String weight;
		String eyecolor;
		
		
	String getInfo ( ) {
		return "Height: " + height +", Weight: " + weight + 
				", EyeColor: " + eyecolor +", Gender: " + gender;
		
	}
		
	void setProperties (String _gender, String _height,
			String _weight, String _eyecolor) {
		
		gender = _gender;
		height = _height;
		weight = _weight;
		eyecolor = _eyecolor;
				
	}
	

}
