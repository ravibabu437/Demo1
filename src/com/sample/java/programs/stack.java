package com.sample.java.programs;

import java.util.*;


public class stack {
	
	public static void main(String[] args)
	{
		List<String> list = new LinkedList<>();
		list.add("Geeks");
		list.add("for");
		list.add("Geeks");
		list.add("GeeksforGeeks");
		Iterator<String> iter = list.iterator();

		while (iter.hasNext())
			System.out.printf(iter.next() + " ");

		System.out.println();
	}

}
