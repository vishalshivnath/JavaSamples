package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");
		
		List<String> result= items.stream().filter(a->!"C".equals(a)).collect(Collectors.toList());
		
		result.forEach(System.out::println);
		
		List<String> lines = Arrays.asList("spring", "node", "mkyong");
	    List<String> results = lines.stream()                // convert list to stream
	                .filter(line -> !"mkyong".equals(line))     // we dont like mkyong
	                .collect(Collectors.toList());              // collect the output and convert streams to a List

	    results.forEach(System.out::println);                //output : spring, node
	        
	        
	}

}
