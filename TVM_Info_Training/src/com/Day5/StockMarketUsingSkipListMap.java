package com.Day5;

import java.util.concurrent.ConcurrentSkipListMap;

public class StockMarketUsingSkipListMap {

	public static void main(String[] args) {
		
		ConcurrentSkipListMap<String,Double> stockPrice = new ConcurrentSkipListMap<>();
		
		Thread t1 = new Thread(
				
				()->{
					stockPrice.put("ACS", 6850.12);
					stockPrice.put("Zoho", 9850.12);
				}
				
				);
	Thread t2 = new Thread(
				
				()->{
					stockPrice.put("IBM", 3850.12);
					stockPrice.put("Infosys", 423850.12);
				}
				
				);
	
	t1.start();
	t2.start();
	
	try {
		t1.join();
		t2.join();
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	stockPrice.forEach((company,price)->System.out.println(company+" -> "+price));
	
	}
	
}
