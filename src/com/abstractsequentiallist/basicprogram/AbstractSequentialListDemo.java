package com.abstractsequentiallist.basicprogram;


import java.util.*; 
import java.util.AbstractSequentialList; 


public class AbstractSequentialListDemo {
	
	 public static void main(String args[]) 
	    { 
	  
	        // Creating an empty AbstractSequentialList 
	        AbstractSequentialList<String> 
	            absqlist = new LinkedList<String>(); 
	  
	        // Using add() method to add elements in the list 
	        absqlist.add("Geeks"); 
	        absqlist.add("for"); 
	        absqlist.add("Geeks"); 
	        absqlist.add("10"); 
	        absqlist.add("20"); 
	  
	        // Output the list 
	        System.out.println("AbstractSequentialList: "
	                           + absqlist); 
	  
	        // Remove the head using remove() 
	        absqlist.remove(3); 
	  
	        // Print the final list 
	        System.out.println("Final List: "
	                           + absqlist); 
	  
	        // Fetching the specific element from the list 
	        // using get() method 
	        System.out.println("The element is: "
	                           + absqlist.get(3)); 
	    } 
	

}
