package yield_sleep;

public class FirstYieldDemo {

	public static void main(String[] args) {
		FirstYield f=new FirstYield();
		f.start();
		for(int i=0;i<5;i++) {
			System.out.println("Main Thread");
		}
	}
}
