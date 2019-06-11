package com.abstractlist;

import java.util.*; 

public class AbstractListDemo1 {
	
	public static void main(String args[]) 
    { 
  
        // Creating an empty AbstractList 
        AbstractList<String> 
            list = new LinkedList<String>(); 
  
        // Using add() method to add elements in the list 
        list.add("Geeks"); 
        list.add("for"); 
        list.add("Geeks"); 
        list.add("10"); 
        list.add("20"); 
  
        // Output the list 
        System.out.println("AbstractList: " + list); 
  
        // Remove the head using remove() 
       // list.remove(3); 
  
        // Print the final list 
        System.out.println("Final AbstractList: " + list); 
  
        // getting the index of last occurence 
        // using lastIndexOf() method 
        int lastindex = list.lastIndexOf("A"); 
  
        // printing the Index 
        System.out.println("Last index of A : "
                           + lastindex); 
    } 

}
