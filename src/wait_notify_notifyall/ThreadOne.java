package wait_notify_notifyall;
 
public class ThreadOne {
	public static void main(String[] args) throws InterruptedException {

		ThreadTwo t=new ThreadTwo();
		t.start();
		Thread.sleep(10000);
		synchronized (t) {
			System.out.println("Main Thread Trying to call wait method");
			t.wait(10000);
			System.out.println("Main thread got notification");
			System.out.println(t.total);
		}
	}
}
