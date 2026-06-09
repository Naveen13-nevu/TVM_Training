package com.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapEntry {

	public static void main(String[] args) {

		Map<Integer,String> map = new HashMap<>();
		map.put(1, "Naveen");
		map.put(2, "Arun");
		map.put(3, "Vel");
		
		for(Map.Entry<Integer,String> entry : map.entrySet()) {
			System.out.println("Key: " + entry.getKey()+" -> value : " + entry.getValue());
		}

	}

}
