package com.leetcode;


public class ConsecutiveOnes_485Leet {
	
	public static int ConsOnes(int []nums) {
		
		int count = 0;
		int maxCount = 0;
		
		for(int num : nums) {
			
			if(num ==1 ) {
				count++;
				if(count > maxCount) {
					maxCount = count;
				}
			}
			else {
				count = 0;
			}
		}
		
		return maxCount;
	}

	public static void main(String[] args) {
	
		int arr[] = {1,1,0,0,1,1,1,1};
		int result = ConsOnes(arr);
		System.out.println(result);

	}

}
