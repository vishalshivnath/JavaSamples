package behavioral.interpreter;

public class AndExpression implements Expression {

	private Expression E1=null;
	private Expression E2=null;
	
	public AndExpression(Expression E1,Expression E2) {
		this.E1=E1;
		this.E2=E2;
	}
	
	@Override
	public boolean interpret(String context) {
		// TODO Auto-generated method stub
		return E1.interpret(context) && E2.interpret(context);
	}

}
