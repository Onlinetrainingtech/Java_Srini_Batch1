import java.util.HashMap;

class Demo18
{
	HashMap<Integer,String>list1=new HashMap<>();
	void get1()
	{
		list1.put(1001,"a1");
		list1.put(1002,"a2");
		list1.put(1003,"a3");
		System.out.println("Your value is::"+list1);
	}
}
public class CollectionP3 {

	public static void main(String[] args) {
		
		Demo18 f1=new Demo18();
		f1.get1();

	}

}
