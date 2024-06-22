class Demo24 extends Thread
{
	public void run()
	{
		System.out.println("Priority::"+currentThread().getPriority());
		System.out.println("ThreadName::"+currentThread().getName());
	}
}
public class ThreadP3 {

	public static void main(String[] args) {
		
		Demo24 t1=new Demo24();
		Demo24 t2=new Demo24();
		t1.start();
		t2.start();

	}

}
