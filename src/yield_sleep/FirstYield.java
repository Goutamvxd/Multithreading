package yield_sleep;

public class FirstYield extends Thread {

	public void run() {
		// TODO Auto-generated method stub

		for(int i=0;i<5;i++) {
			System.out.println("child thread");
			Thread.yield();
			// yield method pass resource to main thread
			// so main thread completes first
		}
	}
}
