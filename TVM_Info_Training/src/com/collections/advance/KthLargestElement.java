package com.collections.advance;

import java.util.PriorityQueue;

class largest{
	
	public static int largestElement(int []arr, int k) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int n:arr) {
			pq.offer(n);
			
			if(pq.size()>k) {
				pq.poll();	
			}
		}
		
		return pq.peek();
	}
}

public class KthLargestElement {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5};
		int k =3;
		int result = largest.largestElement(arr,k);
		System.out.println(result);

	}

}
