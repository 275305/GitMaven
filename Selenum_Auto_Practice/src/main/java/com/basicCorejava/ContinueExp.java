package com.basicCorejava;

public class ContinueExp {
	
	public static void main(String[] args) {
		
		
		  for (int i = 0; i < 10; i++) 
	        { 
	            // terminate loop when i is 5. 
	            if (i == 5) 
	                continue; 
	  
	            System.out.println("i: " + i); 
	        } 
	        System.out.println("Loop complete."); 
	    
	}

}
