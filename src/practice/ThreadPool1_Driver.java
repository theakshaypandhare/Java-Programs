package practice;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class ThreadPool1_Driver {
public static void main(String[] args) throws InterruptedException, ExecutionException {
	
	ExecutorService executorService=Executors.newFixedThreadPool(4);
	 List<Future<Integer>> list = new ArrayList<Future<Integer>>();
     int count=0;
	 Callable<Integer> callable = new ThreadPool1(count);
	for (int i = 0; i < 10; i++) {
		Future<Integer> future= executorService.submit(callable);
		Integer result=future.get();
		count=result;

        list.add(future);
	}
	
	for(Future<Integer> fut : list){
        try {
            //print the return value of Future, notice the output delay in console
            // because Future.get() waits for task to get completed
            System.out.println(new Date()+ "::"+fut.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }executorService.shutdown();
	System.out.println("all request completed successfully");
}
}
