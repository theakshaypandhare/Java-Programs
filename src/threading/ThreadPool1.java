package threading;

public class ThreadPool1 implements Runnable {
	String name;
	static int count=0;
	public ThreadPool1(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("Strat Thread "+name+" "+count++);
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	//System.out.println("ended Thread "+name);

	}

}
