
class Hi implements Runnable{
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hi!"+Thread.currentThread().getPriority());
			try {
				Thread.sleep(500);
				}
			catch(Exception e) {}
		}
	}
}


class Hello implements Runnable{
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello!"+Thread.currentThread().getPriority());
			try {
				Thread.sleep(500);
				}
			catch(Exception e) {}
		}
	}
}


public class ThreadDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Runnable obj1 = new Hi();
		Runnable obj2 = new Hello();
		
		Thread t1 = new Thread(obj1,"Hi Thread");
		Thread t2 = new Thread(obj2,"Hello Thread");

//		t1.setPriority(1);
//		t2.setPriority(10);
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		try {Thread.sleep(10);}catch(Exception e) {}
		t2.start();
		
		System.out.println(t1.isAlive());
		t1.join();
		t2.join();
		System.out.println(t1.isAlive());
		System.out.println("Bye!");
		
//		t1.setName("Hi Thread");
//		t2.setName("Hello Thread");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
	}
}
