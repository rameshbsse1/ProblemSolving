package com.test;

public class FindMax {

	public static void main(String[] args) {
		Integer arr[] = {33, 3, 54, 5};
		int max = arr[0];
		for(int i =1; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}
