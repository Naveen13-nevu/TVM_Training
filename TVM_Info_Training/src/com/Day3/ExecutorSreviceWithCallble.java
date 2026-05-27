package com.Day3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorSreviceWithCallble {

	public static void main(String[] args) throws Exception {
		
		ExecutorService service = Executors.newFixedThreadPool(1);
		
		
		Callable<Integer> task = () ->{
			
			Thread.sleep(2000);
			return 100;
		};
		
		Future<Integer> future = service.submit(task);
		System.out.println("Task Submitted");
		
		Integer result = future.get();
		System.out.println(result);
		service.shutdown();
		

	}

}
