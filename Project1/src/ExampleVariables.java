
public class ExampleVariables 
{
	String pname="apple";//class or global variable
	void get1()
	{
		int pid=1001;//local variables
		System.out.println("This is get1 function"+pid);
	}
	void get2()
	{
		System.out.println("This is get2 function"+pname);
	}

	public static void main(String[] args) {
	
		ExampleVariables f1=new ExampleVariables();
		f1.get1();
		f1.get2();

	}

}
