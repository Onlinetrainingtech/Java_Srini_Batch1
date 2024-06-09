abstract class Sample14
{
	abstract void get1();
	void get2()
	{
		System.out.println("Its is normal method..");
	}
	
}
class Demo16 extends Sample14
{

	@Override
	void get1() {
		
		System.out.println("This is abstract class function");
		
	}
	
}
public class AbstractConcepts {

	public static void main(String[] args) {
		
		Demo16 f1=new Demo16();
		f1.get1();
		f1.get2();

	}

}
