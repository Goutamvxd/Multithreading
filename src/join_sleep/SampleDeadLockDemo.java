package join_sleep;

public class SampleDeadLockDemo {

	public static void main(String[] args) throws InterruptedException {
		SampleDeadLock.lt=Thread.currentThread();
		SampleDeadLock st=new SampleDeadLock();
		st.start();
		st.join();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
			Thread.sleep(2000);
		}
	}
}
