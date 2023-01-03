package synchronization;

public class ColorThread extends Thread {
	ColorWithStatic c;
	String  colorName;
	ColorThread(ColorWithStatic c,String colorName){
		this.c=c;
		this.colorName=colorName;
	}
	public void run() {
		c.pore(colorName);
	}
	
}
