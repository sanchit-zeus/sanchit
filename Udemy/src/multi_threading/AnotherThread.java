package multi_threading;

public class AnotherThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("Hello from "+currentThread().getName());
		
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
			System.out.println("Another thread woke me up.");
		}
		System.out.println("Five seconds have passed. I am awake.");
		
	}
}
