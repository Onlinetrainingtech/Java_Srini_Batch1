import java.util.Scanner;

class Demo13
{
	int empid;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the empid is::");
		empid=sc.nextInt();
		if(empid==1001)
		{
			System.out.println("Its is equal");
		}
		else
		{
			System.out.println("Its is not equal");
		}
	}
	void get2()
	{
		int age,sal,bns;
		System.out.println("Enter the age is::");
		age=sc.nextInt();
		if(age>=61)
		{
			System.out.println("Enter the salary is::");
			sal=sc.nextInt();
			if(sal>=20000)
			{
				bns=sal+500;
				System.out.println("Your bns is::"+bns);
			}
			else
			{
				bns=sal+5000;
				System.out.println("Your bns is::"+bns);
			}
		}
		else
		{
			System.out.println("Age is low");
		}
	}
	void get3()
	{
		int exp=1;
		switch(exp)
		{
		case 1:
			System.out.println("Case 1");
			break;
		case 2:
			System.out.println("Case 2");
			break;
		case 3:
			System.out.println("Case 3");
			break;
		default:
			System.out.println("Default case");
		
		}
	}

}
public class BranchingConcepts {

	public static void main(String[] args) {
		
		Demo13 f1=new Demo13();
		//f1.get1();
		//f1.get2();
		f1.get3();

	}

}
