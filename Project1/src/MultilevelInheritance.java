class B3
{
	int a1=100;
	void get1()
	{
		System.out.println("This is get1 function");
	}
}
class D1 extends B3
{
	void get2()
	{
		System.out.println("This is get2 function");
	}
}
class D2 extends D1
{
	void get3()
	{
		System.out.println("B3 value is::"+a1);
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		
		D2 f1=new D2();
		f1.get1();
		f1.get2();
		f1.get3();

	}

}
