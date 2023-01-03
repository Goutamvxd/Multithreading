package join_sleep;

public class MyThreadJoin extends Thread {

	static Thread mt;
	public void run() {
		
		for(int i=0;i<10;i++) {
			try {
				mt.join();
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("Child Thread");
		}
	}
}
