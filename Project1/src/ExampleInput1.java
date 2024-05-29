import java.util.Scanner;

class Sample1
{
   int empid;
   String empname;
   Scanner sc=new Scanner(System.in);
   void input()
   {
	   System.out.println("Enter the empid value is::");
	   empid=sc.nextInt();
	   System.out.println("Enter the empname value is::");
	   empname=sc.next();
   }
   void display()
   {
	   System.out.println("Your Empid is::"+empid+"Your empname is::"+empname);
   }
}
public class ExampleInput1 {

	public static void main(String[] args) {
		
		Sample1 d1=new Sample1();
		d1.input();
		d1.display();

	}

}
