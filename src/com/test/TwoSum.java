package com.test;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	//Time complexity O(n^2)-Approach-1
	private static int[] findTwoSumInt(int[] nums, int target) {
		
		for (int i=0; i<nums.length; i++) {
			for (int j = 0; j<nums.length; j++) {
				if (nums[i]+nums[j] == target) {
					return new int[] {i, j};
				}
			}
		}
		return new int[] {};
	}
	
	//Time Complexity O(n) - Approach-2
	private static int[] findTwoSumMap(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i=0; i< nums.length; i++) {
			int complement = target - nums[i];
			if(map.containsKey(complement)) {
				return new int[] {map.get(complement), i};
			} else {
				map.put(nums[i], i);
			}
		}
		return new int[] {};
	}
	 
	public static void main(String[] args) {
		//int arr[] = TwoSum.findTwoSumInt(new int[] {7,2,4,9,6,11}, 6);
		//System.out.println(arr[0]+" "+arr[1]);
		
		int arrMap[] = TwoSum.findTwoSumMap(new int[] {7,2,2,9,6,11}, 8);
		System.out.println(arrMap[0]+" "+arrMap[1]);
		
	}
}
