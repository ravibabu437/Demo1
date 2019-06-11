package com.abstractsequentiallist.basicprogram;


import java.util.*;

public class GfG {
	
	
	 public static void main(String[] args) 
	    { 
	        // Creating an instance of the AbstractSequentialList 
	        AbstractSequentialList<Integer> 
	            absl = new LinkedList<>(); 
	  
	        // adding elements to absl 
	        absl.add(5); 
	        absl.add(6); 
	        absl.add(7); 
	  
	        // Printing the list 
	        System.out.println(absl); 
	    } 

}
