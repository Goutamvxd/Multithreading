package wait_notify_notifyall;

public class ThreadTwo extends Thread {

	int total=0;
	public void run() {
		synchronized (this) {
			System.out.println("Child thread starts calculation");
			
			for(int i=1;i<=100;i++) {
				total=total+i;
			}
			System.out.println("child thread trying to give notification");
			this.notify();
		}
	}
}
