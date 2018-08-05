package com.java8;

import java.util.HashMap;
import java.util.Map;


public class MapExmaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer> items=new HashMap<String,Integer>();
		items.put("one",1);
		items.put("two",2);
		items.put("three",3);
		items.put("four",4);
		items.put("five",5);
		
		//Normal way to loop a map
		for(Map.Entry<String, Integer> entry: items.entrySet())
		{
			System.out.println("Item :"+entry.getKey() +" Count :" + entry.getValue() );
		

			
		}
		
		items.forEach((k,v)->System.out.println("Item by java 8 : " + k + " Count : " + v));
		
		items.forEach((k,v)->{
			System.out.println("Item : " + k + " Count : " + v);
			if(k.equals("one"))
			{
				System.out.println("Hello ONE");
			}
			
		}
		
				
		);
	}
	

}

	
