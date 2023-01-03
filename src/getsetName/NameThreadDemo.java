package getsetName;

public class NameThreadDemo {

	public static void main(String[] args) {
		
		//getting Thread name
		System.out.println(Thread.currentThread().getName());
		
		NameThread n=new NameThread();
		System.out.println(n.getName());
	
		//setting thread name
		
		Thread.currentThread().setName("pawan kalyan");
		System.out.println(Thread.currentThread().getName());
		
		// to check weather name has changed or not
		System.out.println(10/0);
	}
}
