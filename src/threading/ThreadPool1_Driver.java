package threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool1_Driver {
public static void main(String[] args) {
	
	ExecutorService executorService=Executors.newFixedThreadPool(2);
	int count=1;
	for (int i = 0; i < 10; i++) {
		executorService.execute(new ThreadPool1("Worker:"+i+" count "+count++));
		System.out.println("xxxxxxxx");
	}
	executorService.shutdown();
	while (!executorService.isTerminated()) {
		
	}
	System.out.println("all request completed successfully");
}
}
