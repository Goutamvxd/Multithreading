package daemon;

public class MyThread extends Thread{

 public void run() {
		for(int i=0;i<10;i++){
			System.out.println("child thred");
		
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {	}
			//System.out.println();
		}
 }
}
