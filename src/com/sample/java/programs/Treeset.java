package com.sample.java.programs;


import java.util.*; 

public class Treeset {
	
	public static void main(String[] args) 
    { 
        TreeSet<String> treeSet = new TreeSet<>(); 
  
        treeSet.add("Geeks"); 
        treeSet.add("for"); 
        treeSet.add("Geeks"); 
        treeSet.add("GeeksforGeeks"); 
  
        for (String temp : treeSet) 
            System.out.printf(temp + " \n"); 
  
        System.out.println("\n"); 
    } 

}
