package wait_notify_notifyall;

public class A {
	public static void main(String[] args) throws InterruptedException{
		B b=new B();
		b.start();
		/*we have to call wait,notify,notifyAll only in
		synchronized area or else we will get runtime exception
		saying: IllegalMonitorStateException
		*/
		b.wait();
	System.out.println(b.total);
	}
}
