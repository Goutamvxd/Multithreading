package wait_notify_notifyall;

public class B extends Thread{

	int total=0;
	public void run() {
		for(int i=1;i<=100;i++) {
			total=total+i;
		}
		
		/*we have to call wait,notify,notifyAll only in
		synchronized area or else we will get runtime exception
		saying: IllegalMonitorStateException
		*/
		this.notify();
		//
	}
}
