package join_sleep;

public class ThreadInterrupt extends Thread {

	public void run() {
		try {
			for(int i=0;i<10;i++) {
				System.out.println("I am lazy Thread");
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("i got Interrupted");
		}
	}
}
