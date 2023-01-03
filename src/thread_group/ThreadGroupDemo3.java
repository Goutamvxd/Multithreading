package thread_group;

public class ThreadGroupDemo3 {
	public static void main(String[] args) throws Exception {
		ThreadGroup pg=new ThreadGroup("parent group");
		ThreadGroup cg=new ThreadGroup(pg,"child group");
		
		MyThread t1=new MyThread(pg, "child thread1");
		MyThread t2=new MyThread(cg, "child thread2");
		
		t1.start();
		t2.start();
		
		System.out.println(pg.activeCount());
		
		System.out.println(pg.activeGroupCount());
		
		pg.list();
		Thread.sleep(10000);
		
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
	}
}
