package synchronization;

public class SyncColor {

	public static void main(String[] args) {
		ColorWithStatic c1=new ColorWithStatic();
		ColorWithStatic c2=new ColorWithStatic();
		
		ColorThread t1=new ColorThread(c1, "white");
		ColorThread t2=new ColorThread(c2, "black");
		
		t1.start();
		t2.start();
	}
}
