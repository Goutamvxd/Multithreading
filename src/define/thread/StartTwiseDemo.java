package define.thread;

public class StartTwiseDemo {

	public static void main(String[] args) {
		StartTwise s=new StartTwise();
		s.start();
		System.out.println("Main Method");
		
		s.start();
	}
}
