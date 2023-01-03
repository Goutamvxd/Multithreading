package join_sleep;

public class InterrupLoophole extends Thread {
 
	public void run() {
		for(int i=0;i<10000;i++) {
			System.out.println("I am Lazy Thread"+i);
		}
		System.out.println("I am entering into sleeping state");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("I got interrupted");
		}
	}
}
