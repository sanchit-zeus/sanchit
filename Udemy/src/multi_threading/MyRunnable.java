package multi_threading;

import static multi_threading.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(ANSI_RED+"Hello from MyRunnable");
		
	}

}
