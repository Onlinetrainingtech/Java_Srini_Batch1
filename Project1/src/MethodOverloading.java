class Demo14
{
	void get1(int empid,String empname)
	{
		System.out.println("Your value is::"+empid+""+empname);
	}
	void get2(long mobile)
	{
		System.out.println("Your value is::"+mobile);
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		
		Demo14 f1=new Demo14();
		f1.get1(1001,"Azar");
		f1.get2(9978766688L);

	}

}
