package deadlock;

public class DeadLock extends Thread {
	A a=new A();
	B b=new B();
	
	public void m1() {
		this.start();
		a.d1(b); // executes by main thread
	}
	public void run() {
		b.d2(a); //executes by child thread
	}
	
	public static void main(String[] args) {
		DeadLock t=new DeadLock();
		t.m1();
	}

}
