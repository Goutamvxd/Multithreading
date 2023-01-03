package synch_block;

public class MyT extends Thread {

	Dis d;
	String name;
	MyT(Dis d,String name){
		this.d=d;
		this.name=name;
	}
	public void run() {
		d.wish(name);
	}
}
