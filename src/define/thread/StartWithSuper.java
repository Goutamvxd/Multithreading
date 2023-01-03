package define.thread;

public class StartWithSuper extends Thread {
	public void start() {
		//calling thread class start method
		super.start();
		System.out.println("star method");
	}
	
	public void run() {
		System.out.println("run method");
	}

}
