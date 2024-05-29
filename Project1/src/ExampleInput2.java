import java.io.DataInputStream;
import java.io.IOException;

class Demo
{
	int empid;
	String empname;
	DataInputStream dis=new DataInputStream(System.in);
	void input() throws IOException
	{
		System.out.println("Enter the empid is::");
		empid=Integer.parseInt(dis.readLine());
		System.out.println("Enter the empname is::");
		empname=dis.readLine();
	}
	void display()
	{
		System.out.println("Your value is::"+empid+""+empname);
	}
}

public class ExampleInput2 {

	public static void main(String[] args) throws IOException {
		

		Demo f1=new Demo();
		f1.input();
		f1.display();
	}

}
