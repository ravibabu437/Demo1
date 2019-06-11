package com.sequentialstream.iterablesplitetator;
import java.util.*; 
import java.util.stream.*; 


public class GfG {
	// Function to create a sequential Stream 
    // from an Iterator 
    public static <T> Stream<T>  
                  iteratorToSequentialStream(Iterator<T> itr) 
    { 
        // Get an iterable from itr 
        Iterable<T> itb = () -> itr; 
  
        // Get spliterator() from iterable and then 
        // Convert into a sequential stream. 
        // The second parameter "false" passess whether the 
        // stream is to be created parallel or not 
        return StreamSupport.stream(itb.spliterator(), false); 
    } 
  
    public static void main(String[] args) 
    { 
        Iterator<String> iterator = Arrays.asList("G", "E", "E", 
                                            "K", "S").iterator(); 
  
        Stream<String> stream = iteratorToSequentialStream(iterator); 
          
        System.out.println("Sequential Stream : " + 
                    stream.collect(Collectors.toList())); 
    } 

}
