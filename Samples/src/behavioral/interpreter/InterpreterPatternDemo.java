package behavioral.interpreter;

public class InterpreterPatternDemo {

	public static Expression getMaleExpression() {
		
		Expression robert=new TerminalExpression("robert");
		Expression john=new TerminalExpression("john");
		
		return new OrExpression(robert,john);
	}
	
	public static Expression getFemaleExpression() {
		
		Expression julie=new TerminalExpression("julie");
		Expression sarah=new TerminalExpression("sarah");
		
		return new AndExpression(julie, sarah);

	}
	
	public static void main(String args[]) {
		
		Expression isMale=getMaleExpression();
		Expression isFemale=getFemaleExpression();
		

	    System.out.println("John is male? " + isMale.interpret("John"));
	    System.out.println("Julie is  women? " + isFemale.interpret("Married Julie"));
	   
	}
}
