interface B1
{
	int a=100;
	void get1();
}
interface B2 extends B1
{
	void get2();
}
class D13 implements B2
{

	@Override
	public void get1() {
		
		System.out.println("Interface B1 is::"+a);
		
	}

	@Override
	public void get2() {
		
		System.out.println("Interface B2");
		
	}
	
}
public class InterfaceP1 {

	public static void main(String[] args) {
		
		D13 f1=new D13();
		f1.get1();
		f1.get2();

	}

}
