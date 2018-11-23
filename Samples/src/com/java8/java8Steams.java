package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class java8Steams {

	
	public static void main(String[] str) {
		
		System.out.println("Using Java 7: ");
		
		//Java 7 Functions
		//Count empty strings
		List<String> strList=Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		Random random=new Random();
		System.out.println("Display strList: "+strList);
		long count = getCountEmptyStringUsingJava7(strList);
		System.out.println("Java 7 Empty String count is: "+count);
		
		count = getCountLength3UsingJava7(strList);
		System.out.println("Strings of length 3: " + count);
			
	    //Eliminate empty string
	    List<String> filtered = deleteEmptyStringsUsingJava7(strList);
	    System.out.println("Filtered List: " + filtered);
	      
	    //Eliminate empty string and join using comma.
	    String mergedString = getMergedStringUsingJava7(strList,", ");
	    System.out.println("Merged String: " + mergedString);
	    
        //get list of square of distinct numbers
	    List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
	    List<Integer> squaresList = getSquares(numbers);
	    System.out.println("Squares List: " + squaresList);
	    
	    List<Integer> integers = Arrays.asList(1,2,13,4,15,6,17,8,19);
		System.out.println("List: " +integers);
	    System.out.println("Highest number in List : " + getMax(integers));
	    System.out.println("Lowest number in List : " + getMin(integers));
	    System.out.println("Sum of all numbers : " + getSum(integers));
	    System.out.println("Average of all numbers : " + getAverage(integers));
	    System.out.println("Random Numbers: ");
	    for(int i = 0; i < 10; i++) {
	         System.out.println(random.nextInt());
	      }
	   
	    //Java 8 Functions
	    System.out.println("Using Java 8: ");
	    System.out.println("List: " +strList);
		System.out.println("Java 8 Empty String count is: "+strList.stream().filter(x->x.isEmpty()).count());
		System.out.println("Java 8 String count length is: "+strList.stream().filter(x->x.length()==3).count());
		List<String> filteredlist=strList.stream().filter(x->!x.isEmpty()).collect(Collectors.toList());
		System.out.println("Java 8 String List after removing blank strings: "+filteredlist);
		
	    String mergedList=strList.stream().filter(x->!x.isEmpty()).collect(Collectors.joining(", "));
		System.out.println("Java 8 String List after merging strings with delimiter : "+mergedList);
		List<Integer> squaresList1=numbers.stream().map(x->x*x).distinct().collect(Collectors.toList());
		System.out.println("Squares List: " + squaresList1);
	    //System.out.println("List: " +integers);
	      
		IntSummaryStatistics stats =numbers.stream().mapToInt(x->x).summaryStatistics();
		System.out.println("Highest number in List : " + stats.getMax());
	    System.out.println("Lowest number in List : " + stats.getMin());
	    System.out.println("Sum of all numbers : " + stats.getSum());
	    System.out.println("Average of all numbers : " + stats.getAverage());
	    System.out.println("Random Numbers: ");
	      
		random.ints().limit(10).sorted().forEach(System.out::println);
		
		
		 //parallel processing
	     count = strList.parallelStream().filter(string -> string.isEmpty()).count();
	     System.out.println("Empty Strings: " + count);
	      
	}

	private static int getAverage(List<Integer> integers) {
		// TODO Auto-generated method stub
		int sum=0;
		for(Integer int1:integers) {
			sum+=int1.intValue();
		}
		return sum/integers.size();
	}

	private static int getSum(List<Integer> integers) {
		int sum=0;
		for(Integer int1: integers) {
			sum+=int1.intValue();
		}
		return sum;
	}

	private static int getMin(List<Integer> integers) {
		int low=integers.get(0).intValue();
		
		for(Integer int1:integers) {
			
			if(low >= int1.intValue()) {
				low=int1.intValue();
			}
		}
		return low;
	}

	private static int getMax(List<Integer> integers) {
		int high=0;
		for(Integer int1:integers) {
			
			if(high <= int1.intValue()) {
				high=int1.intValue();
			}
		}
		return high;
	}

	private static List<Integer> getSquares(List<Integer> numbers) {
		
      List<Integer> squaresList = new ArrayList<Integer>();
		
      for(Integer number: numbers) {
         Integer square = new Integer(number.intValue() * number.intValue());
			
         if(!squaresList.contains(square)) {
            squaresList.add(square);
         }
      }
	  return squaresList;
	
	}

	private static String getMergedStringUsingJava7(List<String> strList, String string) {
		StringBuilder strLocal=new StringBuilder();
		for(String str: strList) {
			if(!str.isEmpty()) {
				strLocal=strLocal.append(str).append(string);
			}
			
		}
		String s1=strLocal.toString();
		return s1.substring(0,s1.length()-2);
	}

	private static List<String> deleteEmptyStringsUsingJava7(List<String> strList) {
		List<String> strList1=new ArrayList<String>();
		
		for(String str: strList) {
			if (!str.isEmpty()){
				strList1.add(str);
			}
		}
		return strList1;

	}

	private static long getCountLength3UsingJava7(List<String> strList) {
		int count=0;
		
		for(String str: strList) {
			if (str.length()==3){
				count++;
			}
		}
		
		return count;
	}

	private static long getCountEmptyStringUsingJava7(List<String> strList) {
		// TODO Auto-generated method stub
		int count=0;
		
		for(String str: strList) {
			if (str.isEmpty()){
				count++;
			}
		}
		
		return count;
	}
}
