package com.collections.advance;

import java.util.ArrayList;
import java.util.HashMap;

public class GroupAnagrams {
	
	public static String group(String str) {
		
		char ch[]=str.toCharArray();
		int n = ch.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(ch[j] > ch[j+1]) {
					char temp = ch[j];
					ch[j]=ch[j+1];
					ch[j+1]=temp;
				}
			}
		}
		
		return new String(ch);
	}

	public static void main(String[] args) {
		
		String str [] = {"eat", "tea", "tan", "ate", "nat", "bat"};
		
		HashMap<String,ArrayList<String>> map = new HashMap<>();
		
		for(String word:str) {
			String key = group(word);
			if(!map.containsKey(key)) {
				map.put(key,new ArrayList<>());
			}
			map.get(key).add(word);
		}
		System.out.println(map.values());
		
		
		
	}
}
