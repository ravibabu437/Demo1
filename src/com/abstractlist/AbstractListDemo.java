package com.abstractlist;

import java.util.*; 

public class AbstractListDemo {
	
	 public static void main(String args[]) 
	    { 
	  
	        // Creating an empty AbstractList 
	        AbstractList<String> list = new LinkedList<String>(); 
	  
	        // Use add() method to add elements in the list 
	        list.add("Geeks"); 
	        list.add("for"); 
	        list.add("Geeks"); 
	        list.add("10"); 
	        list.add("20"); 
	  
	        // Displaying the AbstractList 
	        System.out.println("AbstractList:" + list); 
	    } 

}
