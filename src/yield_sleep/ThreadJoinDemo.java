package yield_sleep;

public class ThreadJoinDemo {

	public static void main(String[] args) throws InterruptedException{
		
		Seetha s=new Seetha();
		s.start();
		
		
		s.join(10000);
		for(int i=0;i<10;i++) {
			System.out.println("Rama Thread");
		}
	}
}
