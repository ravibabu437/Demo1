package com.immutablelist.creationindifferentways;

import com.google.common.collect.ImmutableList; 
import java.util.*; 

public class GFG1 {
	
	// Function to create ImmutableList 
    public static void iList() 
    { 
        // Create ImmutableList using of() 
        ImmutableList<String> immutableList =  
               ImmutableList.of("Geeks", "For", "Geeks"); 
  
        // Print the ImmutableMap 
        System.out.println(immutableList); 
    } 
  
    public static void main(String[] args) 
    { 
        iList(); 
    } 

}
