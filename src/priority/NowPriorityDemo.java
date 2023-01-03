package priority;

public class NowPriorityDemo {

	public static void main(String[] args) {
		// System.out.println(Thread.currentThread().getPriority());
	//	 Thread.currentThread().setPriority(7);
		 NowPriority n=new NowPriority();
		// System.out.println(Thread.currentThread().getPriority());
		 System.out.println(n.getPriority());
	}
}
