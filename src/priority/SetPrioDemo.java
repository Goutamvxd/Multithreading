package priority;

public class SetPrioDemo {

	public static void main(String[] args) {
		SetPrio s=new SetPrio();
		s.setPriority(10);
		s.start();
		
		
		for(int i=0;i<5;i++) {
			System.out.println("Main Thread");
		}
	}
}
