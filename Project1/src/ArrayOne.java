import java.util.Scanner;

class Sample12
{
	int empid[]=new int[5];
	int i,n;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the n value is::");
		n=sc.nextInt();
	   
	}
	void get2()
	{
		for(i=0;i<=n;i++)
		{
			System.out.println("Enter the array value is::");
			empid[i]=sc.nextInt();
		    System.out.println("Your array value is::"+empid[i]);	
		}
		
	}
}
public class ArrayOne {

	public static void main(String[] args) {
		
		Sample12 f1=new Sample12();
		f1.get1();
		f1.get2();

	}

}
