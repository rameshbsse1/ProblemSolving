package com.test;

import java.util.HashMap;
import java.util.Map;

public class TestWordCount {
 
	public static void main(String[] args) {
		String str  = "CSS CORP PVT LTD";
		Map<Character, Integer> map = new HashMap<>();
		/*
		 * for (int i=str.length()-1; i>=0; i--) { if(map.containsKey(str.charAt(i))) {
		 * int count = map.get(str.charAt(i)); map.put(str.charAt(i), ++count); } else {
		 * map.put(str.charAt(i), 1); } }
		 */
		for (int i=0; i<=str.trim().length()-1; i++) {
			if(map.containsKey(str.charAt(i))) {
				int count = map.get(str.charAt(i));
				map.put(str.charAt(i), ++count);
			} else {
				map.put(str.charAt(i), 1);
			}
		}
		System.out.println(map);
		
		
	}
}
