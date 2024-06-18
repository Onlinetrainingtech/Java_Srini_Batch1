
public class Exception2 {

	String s1=null;
	void get1()
	{
		try
		{
		System.out.println(s1.length());
		}
		catch(NullPointerException t)
		{
			System.out.println("Check the keyword"+t);
		}
	}
	public static void main(String[] args) {
		
		Exception2 f1=new Exception2();
		f1.get1();

	}

}


