package com.day2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService service = Executors.newFixedThreadPool(3);
		
		Callable<String> task = ()->{
			Thread.sleep(2000);
			return "payment success";
		};

		Future<String> future = service.submit(task);
		 System.out.println("Processing...");

	        String result = future.get();

	        System.out.println(result);

	        service.shutdown();
	}

}
