package synchronization;

public class SongThread extends Thread{

	Sing s;
	String song;
	SongThread(Sing s,String song){
		this.s=s;
		this.song=song;
	}
	public void run() {
		s.sing(song);
	}
}
