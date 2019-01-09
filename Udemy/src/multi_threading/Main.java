package multi_threading;


public class Main extends ThreadColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello from the main thread.");
		
		Thread anotherThread = new AnotherThread();
		anotherThread.setName("== Another Thread ==");
		anotherThread.start();
		
		new Thread() {
			public void run() {
				System.out.println("Hello from anonymous class thread.");
			}
		}.start();
		
//		Thread myRunnableThread = new Thread(new MyRunnable());
//		myRunnableThread.start();
		
		Thread myRunnableThread = new Thread(new MyRunnable() {
			@Override
			public void run() {
//				super.run();
				System.out.println("Hello from anonymous class's implementation of run()");
				try {
					anotherThread.join(2000);
					System.out.println("anotherThread terminated, or timed out, so I'am running.");
				}
				catch(InterruptedException e){
					System.out.println("I couldn't watafter all. I was interrupted");
				}
			}
		});
		myRunnableThread.start();
		anotherThread.interrupt();
		
		System.out.println("Hello again from the main thread.");

	}

}
