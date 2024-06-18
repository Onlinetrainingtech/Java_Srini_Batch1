import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception3 {

	
	int s1;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		try
		{
		System.out.println("Enter the s1 value is::");
		s1=sc.nextInt();
		System.out.println("Your value is::"+s1);
		}
		catch(InputMismatchException t)
		{
			System.out.println("Please check the input::"+t);
		}
		finally
		{
			System.out.println("This is finally block");
		}
	}
	public static void main(String[] args) {
		
		Exception3 h1=new Exception3();
		h1.get1();
	}

}
