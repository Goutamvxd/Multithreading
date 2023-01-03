package join_sleep;

public class InterrupLoopholeDemo {

	public static void main(String[] args) {
		InterrupLoophole i=new InterrupLoophole();
		i.start();
		i.interrupt();
		System.out.println("End of main Thread");
	}
}
