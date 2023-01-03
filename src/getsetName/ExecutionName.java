package getsetName;

public class ExecutionName extends Thread {

	public void run() {
		System.out.println("run method executed by Thread:"+ Thread.currentThread().getName());
	}
}
