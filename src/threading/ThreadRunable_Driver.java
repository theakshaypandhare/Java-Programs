package threading;

public class ThreadRunable_Driver  {
	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime().availableProcessors());
		ThreadRunable runable=new ThreadRunable();
		Thread t=new Thread(runable);
		t.start();
		Thread.currentThread().setPriority(1);
		System.out.println("------------"+t.currentThread().getPriority());
		t.yield();
		for (int i = 0; i < 5; i++) {
			System.out.println("main");
		}
	}
}