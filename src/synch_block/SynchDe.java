package synch_block;

public class SynchDe {

	public static void main(String[] args) {
		/*
		 * if we create two object
		 *and call wish method from different threads
		 *then different threads will start execution
		 *simultaneously and output will be of
		 *irregular in nature
		 * 
		 * example below:
		 * 
		 * Dis d1=new Dis(); Dis d2=new Dis(); MyT t1=new MyT(d1, "Dhoni"); MyT t2=new
		 * MyT(d2, "Yuvraj");
		 * 
		 * t1.start(); t2.start();
		 */
		
		/*
		 * this is for object level lock
		 * Dis d=new Dis(); MyT t1=new MyT(d, "Dhoni"); MyT t2=new MyT(d, "Yuvraj");
		 * 
		 * t1.start(); t2.start();
		 */
		
		
		/*
		 * class level lock of different objects
		 * 
		 * 
		 */
		Dis d1=new Dis();
		Dis d2=new Dis();
		MyT t1=new MyT(d1, "Dhoni");
		MyT t2=new MyT(d2, "Yuvraj");
		t1.start();
		t2.start();
	}
}
