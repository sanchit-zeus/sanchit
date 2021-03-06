/*problem is arising because both the threads are accessing the ,the method
at the same time*/
class Counter{
	
	int count;
	public synchronized void increment() {
		count++;
	}
}

public class SyncDemo {

	public static void main(String[] args) throws Exception{
		
		Counter c = new Counter();
		c.increment();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					c.increment();
				}
			}
		});
		
        Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i <= 1000; i++) {
					c.increment();
				}
			}
		});
        
        t2.start();
		t1.start();
		t1.join();
		t2.join();
		System.out.println("Count "+c.count);
	}
}
