package synchronization;

public class SongSynchroDemo {
	public static void main(String[] args) {
		Sing s1=new Sing();
		Sing s2=new Sing();
		SongThread t1=new SongThread(s1, "Tum hi ho");
		SongThread t2=new SongThread(s2, "Rabka shukarana");
		
		t1.start();
		t2.start();
		
	}
}
