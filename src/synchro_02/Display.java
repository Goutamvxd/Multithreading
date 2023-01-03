package synchro_02;

public class Display {
	/*
	//public void displayn() {  
	 * if we define method as void 
	 * in this senario it will provide 
	 * irregular output
	 */
	// if we want to execute only one thread at a time
	// make method as
	
	// public synchronized void displayn(){
	public synchronized void displayn() {
		for(int i=1;i<=10;i++) {
		System.out.print(i);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		
		
		}
	}
	
	/*
	//public void displayc() {  
	 * if we define method as void 
	 * in this senario it will provide 
	 * irregular output
	 */
	
	// if we want to execute only one thread at a time
	// make method as
	
	// public synchronized void displayc(){
	
	
	
	
	public synchronized void displayc() {
		for(int i=65;i<=75;i++) {
			System.out.print((char)i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
			
		}
	}
}
