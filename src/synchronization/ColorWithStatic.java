package synchronization;

public class ColorWithStatic {

	public static synchronized void pore(String colorName) {
		for (int i = 0; i < 10; i++) {
			System.out.print("color Of:");

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
			System.out.println(colorName);
		}
	}
}
