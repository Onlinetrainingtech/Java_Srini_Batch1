
public class Exception1 {
	
	void get1()
	{
		try
		{
			int a=100/0;
			System.out.println("Your value is::"+a);
		}
		catch(Exception t)
		{
			System.out.println("Please check the division"+t);
		}
		
		get2();
	}
	void get2()
	{
		System.out.println("Its is get2 function");
	}
	
	

	public static void main(String[] args) {
		
		Exception1 f1=new Exception1();
		f1.get1();

	}

}
