
public class ThreadP2 implements Runnable
{

	public void run()
	{
		try {
			System.out.println("InRun");
			Thread.sleep(10000);
			System.out.println("InOut");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
	
		ThreadP2 f1=new ThreadP2();
		Thread t1=new Thread(f1);
		t1.start();

	}

}
