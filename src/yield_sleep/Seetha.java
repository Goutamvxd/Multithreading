package yield_sleep;

public class Seetha extends Thread {
	public void run() {
		// TODO Auto-generated method stub
			for(int i=0;i<10;i++) {
				System.out.println("seetha Thread");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					
				}
			}
	}
}
