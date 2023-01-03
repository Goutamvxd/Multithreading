package join_sleep;

public class SampleDeadLock extends Thread{
static Thread lt;

public void run() {
	try {
		lt.join();
	} catch (InterruptedException e) {
		// TODO: handle exception
	}
	System.out.println("Child Thread");
}
}
