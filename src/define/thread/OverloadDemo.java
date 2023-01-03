package define.thread;

public class OverloadDemo {

	public static void main(String[] args) {
		OverloadRun r=new OverloadRun();
		r.start();
		
		//System.out.println("Main thread");
	
	//we cannot predict exact output
		/*
		 * possible output
		 * 1> no args
		 * 	  Main Thread
		 * 2> Main Thread
		 * 	  no args
		 */
	}
}
