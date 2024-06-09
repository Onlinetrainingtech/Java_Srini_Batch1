class Demo17
{
	int pid;
	String pname;
	static int a=10;
	Demo17()
	{
		a++;
		System.out.println(a);
	}
	void get1(int pid,String pname)
	{
		this.pid=pid;
		this.pname=pname;
		System.out.println("Your data::"+pid+""+pname);
	}
	void display()
	{
		System.out.println("Yout data is::"+pid+""+pname);
	}
}
public class StaticConcepts {

	public static void main(String[] args) {
		
		//new Demo17();
		//new Demo17();
		Demo17 f1=new Demo17();
		f1.get1(1001,"apple");
		f1.display();

	}

}
