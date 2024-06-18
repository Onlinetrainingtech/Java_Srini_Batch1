import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

class Demo19
{
//	Map<Integer,String>j1=new HashMap<>();
	
//	TreeMap<Integer,String>j1=new TreeMap<>();
	
	Hashtable<Integer,String>j1=new Hashtable<>();
	
	void get1()
	{
		j1.put(1001,"s1");
		j1.put(1002,"s2");
		j1.put(1003,"s3");
		j1.put(1004,"s4");
		
	}
	void get2()
	{
		for(Map.Entry k:j1.entrySet())
		{
			System.out.println("Display the data is::"+k.getKey()+""+k.getValue());
		}
		System.out.println("Searching of::"+j1.containsKey(1001));
		System.out.println("Remove of::"+j1.remove(1002));
		System.out.println("Check of::"+j1.containsKey(1002));
		System.out.println("Size of::"+j1.size());
		System.out.println("Index of::"+j1.get(1004));
		System.out.println(j1);
	}
}
public class MapConcepts {

	public static void main(String[] args) {
		
		Demo19 f1=new Demo19();
		f1.get1();
		f1.get2();

	}

}
