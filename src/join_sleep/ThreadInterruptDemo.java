package join_sleep;

public class ThreadInterruptDemo {
public static void main(String[] args) {
	ThreadInterrupt t=new ThreadInterrupt();
	t.start();
	t.interrupt();
	System.out.println("End of main Thread");
}
}
