package week7.task1;

public abstract class BinaryExpression extends Expression {
	protected Expression left;
	protected Expression right;

	public abstract Expression left();
	public abstract Expression right();
	
}
