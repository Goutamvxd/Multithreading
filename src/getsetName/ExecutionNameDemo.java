package getsetName;

public class ExecutionNameDemo {

	public static void main(String[] args) {
		ExecutionName e=new ExecutionName();
		e.start();
		System.out.println("main method executed by Thread: "+ Thread.currentThread().getName());
		 
	}
}
