
class Q{
	
	int num;
	boolean ValueSet=false;
	
	public synchronized void put(int num) {
		
		while(ValueSet) {
			try {wait();}catch(Exception e) {}
		}

		System.out.println("Put :"+num);
		this.num=num;
		ValueSet= true;
		notify();
	}
	
	public synchronized void get() {
		
		while(!ValueSet) {
			try {wait();}catch(Exception e) {}
		}
		
		System.out.println("Get :"+num);
		ValueSet = false;
		notify();
	}
}


class Producer implements Runnable{
	
	Q q;
	public Producer(Q q) {
		this.q=q;
		Thread t = new Thread(this,"Producer");
		t.start();
	}
	
	@Override
	public void run() {
		int i=0;
		while(true) {
			q.put(i++);
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
}


class Consumer implements Runnable{
	
	Q q;

	public Consumer(Q q) {
		this.q=q;
		Thread t = new Thread(this,"Producer");
		t.start();
	}

	@Override
	public void run() {
		while(true) {
			q.get();
			try {Thread.sleep(5000);}catch(Exception e) {}
		}
	}
}

public class InterThread {

	public static void main(String[] args) {
		Q q = new Q();
		new Producer(q);
		new Consumer(q);

	}
}
