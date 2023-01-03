package define.thread;


// main thread and main methods are different
public class ThreadDemo {

	public static void main(String[] args) {
		// only one thread is here now : that is main thread
		MyThread t=new MyThread();
		//above is thread instantiation
		
		t.start();
		//main thread starts child thread
		
		for(int i=0;i<5;i++) {
			System.out.println("Main Thread");
		}
		
		//main thread job
	}
}
