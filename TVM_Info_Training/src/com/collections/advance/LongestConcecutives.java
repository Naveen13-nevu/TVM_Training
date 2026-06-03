package com.collections.advance;

import java.util.HashSet;

public class LongestConcecutives {
	
	public static int largest(int arr[]) {
		
		HashSet<Integer> set = new HashSet<>();
		int maxLength=0;
		
		for(int num:arr) {
			set.add(num);
		}
		
		for(int num : set) {
			if(!set.contains(num-1)) {
				int current = num;
				int length =1;
				
				while(set.contains(current+1)) {
					current++;
					length++;
				}
				if(length>maxLength) {
					maxLength = length;
				}
			}
		}
		
		return maxLength;
	}

	public static void main(String[] args) {

		int arr[]= {100,1,2,3,4,200,300,400,500,600};
		int result = largest(arr);
		System.out.println(result);

	}

}
