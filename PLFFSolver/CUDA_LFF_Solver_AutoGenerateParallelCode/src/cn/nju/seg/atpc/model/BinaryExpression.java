package cn.nju.seg.atpc.model;

import org.eclipse.cdt.core.dom.ast.IASTExpression;


/**
 * 条件表达式
 * @author zhanghui
 *
 */
public class BinaryExpression extends Expression
{
    private Operator op;
	private Expression operand1;
	private Expression operand2;
    private String id;
    private IASTExpression iastExpression;
    
    //专门为了刻画一个约束的非线性程度
    private double NonLinearDegree=0;
    
	public double getNonLinearDegree() 
	{
		return NonLinearDegree;
	}

	public void setNonLinearDegree(double nonLinearDegree) 
	{
		NonLinearDegree = nonLinearDegree;
	}

	public void setId(String id) 
	{
		this.id = id;
	}
	
	public String getId() 
	{
		return id;
	}
	
	public boolean equals(Object obj) 
	{
        return (this.getId() == ((BinaryExpression) obj).getId());
    }
	
	public BinaryExpression() 
	{
		this.op = null;
		this.operand1 = null;
		this.operand2 = null;
		this.iastExpression = null;
	}
	
	public BinaryExpression(Operator op, Expression operand1, Expression operand2) 
	{
		this.op = op;
		this.operand1 = operand1;
		this.operand2 = operand2; 
		this.iastExpression = null;
	}
	
	public Operator getOp() 
	{
		return op;
	}

	public void setOp(Operator op) 
	{
		this.op = op;
	}

	public Expression getOperand1() 
	{
		return operand1;
	}
	
	public void setOperand1(Expression operand1) 
	{
		this.operand1 = operand1;
	}
	
	public Expression getOperand2() 
	{
		return operand2;
	}
	
	public void setOperand2(Expression operand2) 
	{
		this.operand2 = operand2;
	}
	


	public IASTExpression getIastExpression() {
		return iastExpression;
	}

	public void setIastExpression(IASTExpression iastExpression) {
		this.iastExpression = iastExpression;
	}

	@Override
	public String toString() 
	{
		if(this.op==Operator.AND||this.op==Operator.OR)
		{
			return "("+this.operand1.toString()+")"+this.op.toString()+"("+this.operand2.toString()+")";
		}
		else
		{
			return this.operand1.toString()+this.op.toString()+this.operand2.toString();
		}
	}
}
