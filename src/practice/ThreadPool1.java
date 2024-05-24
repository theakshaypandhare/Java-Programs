package practice;

import java.util.concurrent.Callable;

public class ThreadPool1 implements Callable<Integer> {
	String name;
	static int count = 0;

	public ThreadPool1(int i) {
		count = i;
	}

	@Override
	public Integer call() throws Exception {
		System.out.println("Strat Thread " + count++ );
		
			Thread.sleep(2000);
		System.out.println("ended Thread " +count);
		return count;
	}

	int cout100() {
		for (int i = 0; i < 100; i++) 
		{
			count++;
		}
		return count;

	}

}
