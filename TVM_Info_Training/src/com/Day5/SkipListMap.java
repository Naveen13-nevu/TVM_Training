package com.Day5;

import java.util.concurrent.ConcurrentSkipListMap;

public class SkipListMap {

	public static void main(String[] args) {
		
		ConcurrentSkipListMap<Integer,String> c = new ConcurrentSkipListMap<>();
		c.put(1,"Java");
		c.put(4,"python");
		c.put(2, "Javascript");
		c.put(3, "C#");
		
		System.out.println(c);

	}

}
