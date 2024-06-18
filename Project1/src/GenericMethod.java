class Demo21
{
	public <M>M test(M t)
	{
		return t;
	}
}
public class GenericMethod {

	public static void main(String[] args) {
		
		
		Demo21 f1=new Demo21();
		System.out.println(f1.test(1001));
		System.out.println(f1.test("Azar"));
		System.out.println(f1.test(2.4));

	}

}
