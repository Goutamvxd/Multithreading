package define.thread;

public class MyThread extends Thread {

	public void run() {
		// TODO Auto-generated method stub

		//child thread job
		for(int i=0;i<5;i++) {
			System.out.println("Child Thread");
		}
	}
	
}
