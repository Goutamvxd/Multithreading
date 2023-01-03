package define.thread;

public class OverridingStartDemo {

	public static void main(String[] args) {
		OverridingStartMethod r=new OverridingStartMethod();
		r.start();
		System.out.println("Main  Thread");
	}
}
