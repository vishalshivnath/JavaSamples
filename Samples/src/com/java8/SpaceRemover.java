package com.java8;

public class SpaceRemover {

	public static void main(String[] args) {
		
		String mostFamous = "Rudolph the Red-Nosed Reindeer";
		char[] mfl=mostFamous.toCharArray();
		char current ;
		for (int dex = 0; dex < mfl.length; dex++) {
             current = mfl[dex];
             if (current != ' ') {
                 System.out.print(current);
             } else {
                 System.out.print('.');
             }
         }
         System.out.println();
         System.out.println(mostFamous.length());
         for(int j=0;j<mostFamous.length();j++) {
        	 if (mostFamous.charAt(j) != ' ') {
                 System.out.print(mostFamous.charAt(j) );
             } else {
                 System.out.print('.');
             }
         }
	}
}
