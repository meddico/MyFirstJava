package com.coderscampus.objects;

import java.util.Date;

public class whileLoopExample {
	void whileLoopExample1 () {
		
		int i = 0;
		while (i < 10){
			System.out.println(i);
		i = i+1;
		}
		System.out.println("Done");
		
	}
	
	
	void whileLoopExample2 () {
		
		Date now = new Date();
		Date stopNow = new Date(121,7,18,21,38,0);
		int i = 0;
		while (now.before(stopNow)) {
			i = i + 1;
			System.out.println(i + ": " + now);
			now = new Date();
			
		}
	
			
		}
		
	
	

}
