package com.java8;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Java8Tester {

	public static void main(String[] string) {
		
		List<String> names1=new ArrayList<String>();
		names1.add("Vishal");
		names1.add("Buddho");
		names1.add("Shasahnk");
		names1.add("Vijay");
		
		List<String> names2=new ArrayList<String>();
		names2.add("Mahesh ");
        names2.add("Suresh ");
        names2.add("Ramesh ");
        names2.add("Naresh ");
        names2.add("Kalpesh ");
        
        Java8Tester tester = new Java8Tester();
        System.out.println("Sort using Java 7 syntax: ");
  		
        tester.sortUsingJava7(names1);
        System.out.println(names1);
        System.out.println("Sort using Java 8 syntax: ");
  		
        tester.sortUsingJava8(names2);
        System.out.println(names2);
        
	}
	
	public void sortUsingJava7(List<String> names1) {
	
		Collections.sort(names1, new Comparator<String>() {
			
				@Override 
				public int compare(String s1,String s2) {
					return s1.compareTo(s2);
				}	
			}	
		);
	}
	
	public void sortUsingJava8(List<String> names2) {
		
		Collections.sort(names2, (s1,s2)->s1.compareTo(s2) );
		
	}
	
	
}
