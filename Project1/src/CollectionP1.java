import java.util.HashSet;
import java.util.TreeSet;

class Demo12
{
//	HashSet<Integer>list1=new HashSet<>();
	TreeSet<Integer>list1=new TreeSet<>();
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
		System.out.println("Removing the data is::"+list1.remove(1001));
		System.out.println("Total size of data is::"+list1.size());
		System.out.println("After Removing searching data is::"+list1.contains(1001));
	}

}
public class CollectionP1 {

	public static void main(String[] args) {
		
		Demo12 f1=new Demo12();
		f1.get1();

	}

}
