import java.util.ArrayDeque;

class Sample17
{
	void get1()
	{
		ArrayDeque<Integer>obj=new ArrayDeque<>();
		obj.addFirst(2001);
		obj.add(1001);
		obj.add(1002);
		obj.add(1003);
		obj.addLast(3001);
		
		System.out.println("Your data is::"+obj);
		System.out.println(""+obj.getFirst());
		System.out.println(""+obj.getLast());
	}
}
public class ArrayDequeP1 {

	public static void main(String[] args) {
		
		Sample17 f1=new Sample17();
		f1.get1();

	}

}
