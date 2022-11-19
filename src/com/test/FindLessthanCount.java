package com.test;

public class FindLessthanCount {

	public static void main(String[] args) {
		
		int arr[] = {2,3,1,4,6,8,9};
		int target = 9;
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < target)
				count  = count + 1;
		}
		System.out.println(count);
	}
}
