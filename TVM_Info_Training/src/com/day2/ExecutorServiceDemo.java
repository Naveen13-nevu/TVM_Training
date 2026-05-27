package com.day2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {

	public static void main(String[] args) {
		
		// Step 1: Create thread pool
        ExecutorService service = Executors.newFixedThreadPool(3);

        // Step 2: Submit tasks
        for(int i = 1; i <= 10; i++) {

            int taskId = i;

            service.submit(() -> {

                System.out.println(
                    "Task " + taskId +
                    " handled by " +
                    Thread.currentThread().getName()
                );

                try {
                    Thread.sleep(2000);
                } catch(Exception e) {
                    e.printStackTrace();
                }

                System.out.println(
                    "Task " + taskId + " completed"
                );
            });
        }

        // Step 3: Shutdown
        service.shutdown();
        
	}

}
