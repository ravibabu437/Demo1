package com.collections.withoutdoublebraceinitialization;

import java.util.HashSet; 
import java.util.Set; 

public class DoubleBrace {
	
	public static void main(String[] args) 
    { 
        Set<String> sets = new HashSet<String>(); 
        sets.add("one"); 
        sets.add("two"); 
        sets.add("three"); 
  
        // ... 
  
        // Now pass above collection as parameter to method 
        useInSomeMethod(sets); 
    } 
  
    private static void useInSomeMethod(Set<String> sets) 
    { 
        System.out.println(sets); 
    } 

}
