package com.Day5;


import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIterator {

	public static void main(String[] args) {
		
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
		list.add("Naveen");
		list.add("prem");
		
		Iterator <String> it = list.iterator();
		
			while(it.hasNext()) {
				String s = it.next();
				System.out.println(s);
				list.add("Arun");
			}
			
		
		

	}

}
