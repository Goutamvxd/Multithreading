package runnable;

public class MyRunnableDemo {

	public static void main(String[] args) {
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);  // there is no run method in MyRunnable and in Runnble
		// so we need to call run method from the Thread class 
		// and passing object reference to the thread constructor 
		// and calling start method
		t.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("Main Thread");
		}
	}
}
