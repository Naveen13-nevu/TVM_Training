package com.Day5;

import java.util.concurrent.ConcurrentSkipListMap;

public class SkipListHashMapSampkes {

	public static void main(String[] args) throws InterruptedException {

		ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();
		
		Thread t1 = new Thread(
				()->{
					map.put(101, "Naveen");
				}
				);
		
		Thread t2 = new Thread(
				
				()->{
					map.put(102, "Prem");
				}
				);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println(map);

	}

}
