package join_sleep;

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		MyThreadJoin.mt = Thread.currentThread();
		MyThreadJoin t=new MyThreadJoin();
		t.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
			Thread.sleep(2000);
		}
	}
}
