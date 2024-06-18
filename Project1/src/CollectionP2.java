import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

class Demo15
{

//	ArrayList<Integer>list1=new ArrayList<>();
	LinkedList<Integer>list1=new LinkedList<>();
	void get1()
	{
		list1.add(1001);
		list1.add(1002);
		list1.add(1003);
		list1.add(1004);
		list1.add(1004);
		
		System.out.println("Your data is::"+list1);
		System.out.println("Total Size of data is::"+list1.size());
		System.out.println("Searching data is::"+list1.contains(1001));
//		System.out.println("Removing the data is::"+list1.remove(1001));
//		System.out.println("Total size of data is::"+list1.size());
//		System.out.println("After Removing searching data is::"+list1.contains(1001));
		
		Iterator f1=list1.iterator();
		while(f1.hasNext())
		{
			System.out.println("Inside the data is::"+f1.next());
		}
			
	}

}
public class CollectionP2 {

	public static void main(String[] args) {
	
		Demo15 f3=new Demo15();
		f3.get1();

	}

}
