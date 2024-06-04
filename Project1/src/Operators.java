class Demo3
{
	void ComparisionOperator()
	{
		int a=100,b=200;
		System.out.println("RelationalOperator");
		System.out.println("Lessthan::"+(a<b));
		System.out.println("Greaterthan::"+(a>b));
		System.out.println("Equal to::"+(a==b));
		System.out.println("NotEqual to::"+(a!=b));
	}
	void LogicalOperator()
	{
		int a1=400,b1=200;
		System.out.println("LogicalOperator");
		System.out.println("LogicalAND::"+((a1>b1)&&(b1<a1)));
		System.out.println("LogicalOR::"+((a1<b1)||(b1<a1)));
		System.out.println("LogicalNOT::"+((a1>b1)));
	}
	void BitwiseOperator()
	{ 
		int a2=2,b2=3;
		System.out.println("BitwiseOperator");
		System.out.println("BitwiseAND::"+((a2&b2)));
		System.out.println("BitwiseOR::"+((a2|b2)));
		System.out.println("BitwiseXOR::"+(a2^b2));
		System.out.println("LeftShift::"+(a2<<1));
		System.out.println("RightShift::"+(a2>>1));
	}
}

public class Operators {

	public static void main(String[] args) {
		
		
		Demo3 f1=new Demo3();
		//f1.ComparisionOperator();
		//f1.LogicalOperator();
		f1.BitwiseOperator();

	}

}
