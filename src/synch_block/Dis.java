package synch_block;

public class Dis {

	public void wish(String name) {
	/*
	 * 1 lakh lines of code
	 */
		
		// object level lock
			//synchronized (this) {
		
		
		
		
		
		//class level lock
		
		//synchronized (Dis.class) {
			
		/*
		 * lock is not available for primitive types
		 * 
		 * that will through compile time error
		 */
		/*int x=10;
		
		synchronized (x) {
			*/
		
		for(int i=0;i<10;i++) {
			System.out.print("Good morning:");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
			System.out.println(name);
		}
		
		
		
	}// checked for primitive type
	
		//} for class level
			
			/*
			 * 1 lakh lines of code
			 */
		//}
	}

