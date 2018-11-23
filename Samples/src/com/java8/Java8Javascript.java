package com.java8;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Java8Javascript {

	public static void main(String[] str) {
		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
	    ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");
	    String name="Mahesh";
	    Integer result=null;
	    try {
	    	nashorn.eval("print('"+name+"')");
	    	result = (Integer) nashorn.eval("10 + 2");
	    }catch(ScriptException e)
	    {
	    	System.out.println("Error executing script: "+ e.getMessage());
	    }
	    System.out.println(result.toString());
	    
	    
	    /*
	    var BigDecimal = Java.type('java.math.BigDecimal');

	    function calculate(amount, percentage) {

	       var result = new BigDecimal(amount).multiply(new BigDecimal(percentage)).divide(
	          new BigDecimal("100"), 2, BigDecimal.ROUND_HALF_EVEN);
	       
	       return result.toPlainString();
	    }
	    var result = calculate(568000000000000000023,13.9);
	    print(result);
	    */
	    
	}
	
}
