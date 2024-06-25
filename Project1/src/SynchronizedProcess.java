class Counter
{
	private int count=0;
	
	//synchronized method to increment the count
	
	public synchronized void increment()
	{
		count++;
	}
	//Method to get the count value
	public int getCount()
	{
		return count;
	}
}
public class SynchronizedProcess extends Thread 
{

	private Counter counter;
	
	SynchronizedProcess(Counter counter)
	{
		this.counter=counter;
	}
	public void run()
	{
		for(int i=0;i<=1000;i++)
		{
			counter.increment();
		}
	}
	public static void main(String[] args) {
		
		Counter counter=new Counter();
		SynchronizedProcess t1=new SynchronizedProcess(counter);
		SynchronizedProcess t2=new SynchronizedProcess(counter);
		SynchronizedProcess t3=new SynchronizedProcess(counter);
		
		t1.start();
		t2.start();
		t3.start();
		
		//Join the Thread
		
		try
		{
			t1.join();
			t2.join();
			t3.join();
		}
		catch(InterruptedException t)
		{
			
		}
		System.out.println("Final Count::"+counter.getCount());

	}

}
