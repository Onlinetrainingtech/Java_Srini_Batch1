
public class StrictfpConcepts 
{
   public strictfp double add(double a,double b)
   {
	   return a+b;
   }
   public strictfp double multiply(double a,double b)
   {
	   return a*b;
   }
   
	public static void main(String[] args) {
		
		StrictfpConcepts example=new StrictfpConcepts();
		double num1=10.12232343;
		double num2=2.9232332;
		double sum=example.add(num1, num2);
		double product=example.multiply(num1,num2);
		System.out.println("Sum::"+sum);
		System.out.println("Product::"+product);

	}

}
