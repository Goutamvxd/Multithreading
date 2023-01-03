package define.thread;

public class OverloadRun extends Thread{

	
	public void run() {
		System.out.println("no args run");
	}
	
	public void run(int i) {
		System.out.println("with int args run");
	}
}
