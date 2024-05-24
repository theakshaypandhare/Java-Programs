package threading;

public class ThreadRunable implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("------------"+Thread.currentThread().getPriority());
		for (int i = 0; i < 5; i++) {
			System.out.println("child");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
