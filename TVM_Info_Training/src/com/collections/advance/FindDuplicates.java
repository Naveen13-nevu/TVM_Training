package com.collections.advance;

import java.util.HashSet;

class FindDup{
	
	 public static void duplicate(int arr[]) {
		 
		 HashSet<Integer> set = new HashSet<>();
		 HashSet<Integer> duplicate = new HashSet<>();
		 
		 for(int n:arr) {
			 
			 if(set.contains(n)) {
				 duplicate.add(n);
			 }
			 else {
				 set.add(n);
			 }
		 }
		 System.out.println(duplicate);
	 }
}

public class FindDuplicates {

	public static void main(String[] args) {

		int arr[] = {1,1,2,2,3,3,4,4,5,5};
		FindDup.duplicate(arr);

	}

}
