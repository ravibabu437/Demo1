package com.immutablelist.creationindifferentways;

import java.util.*; 
import com.google.common.collect.ImmutableList; 

public class GfG3 {
	
	public static void main(String args[]) 
    { 
        // non-empty immutable set 
        ImmutableList<String> iList = ImmutableList.<String>builder().add("Geeks", "For", "Geeks").build();  
                                          
  
        // Let's print the List 
        System.out.println(iList); 
    } 

}
