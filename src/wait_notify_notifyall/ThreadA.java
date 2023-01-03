package wait_notify_notifyall;

public class ThreadA {

	public static void main(String[] args) throws InterruptedException {
		ThreadB b=new ThreadB();
		b.start();
		Thread.sleep(10000);
		System.out.println(b.total);
	}
}
