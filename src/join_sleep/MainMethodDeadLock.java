package join_sleep;

public class MainMethodDeadLock {

	public static void main(String[] args) throws InterruptedException{
		Thread.currentThread().join();
		System.out.println("Main thead");
	}
}
