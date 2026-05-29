package com.Day5;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastIterator {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
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
