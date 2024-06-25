
public class ThreadP4 extends Thread
{
	private String threadName;
	
	public ThreadP4(String name) {
		
		threadName=name;
	}
	
	public void run()
	{
		System.out.println(threadName+"is starting..");
		try
		{
			Thread.sleep(10000);
		}
		catch(InterruptedException t)
		{
			System.out.println(t);
		}
		System.out.println(threadName+"has finished");
	}

	
	public static void main(String[] args) {
		
		ThreadP4 t1=new ThreadP4("Thread-1");
		ThreadP4 t2=new ThreadP4("Thread-2");
		ThreadP4 t3=new ThreadP4("Thread-3");
		
		//Start the thread
		t1.start();
		t2.start();
		t3.start();
		
		//join the threads
		try
		{
			t1.join(10000);
			System.out.println("Joined"+t1.getName());
			t2.join();
			System.out.println("Joined"+t2.getName());
			t3.join();
			System.out.println("Joined"+t3.getName());
		}
		catch(InterruptedException t)
		{
			System.out.println("Main interruped while joining..");
		}
		System.out.println("All threads have finished execution..");
	}

}
