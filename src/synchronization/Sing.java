package synchronization;

public class Sing {

	public synchronized void sing(String song) {
		for(int i=0;i<10;i++) {
			System.out.print("Singing song:");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {	}
			System.out.println(song);
			
		}
	}
}
