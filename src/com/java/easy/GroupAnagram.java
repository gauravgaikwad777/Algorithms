package com.java.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = {"eat", "tea", "tan", "ate", "nat", "bat"};
		groupAnagrams(a);

	}
	
	public static List<List<String>> groupAnagrams(String[] strs) {
	      Map<String, List<String>> map = new HashMap<>();
	      for (String word : strs) {
	        char[] c = word.toCharArray();
	        Arrays.sort(c);
	        String key = new String(c);
	        if (!map.containsKey(key)) {
	          map.put(key, new ArrayList<>());
	        }
	        map.get(key).add(word);
	      }
	      return new ArrayList<>(map.values());
	    }
	
}


//private String color;
//public GroupAnagram(String color) {
//	this.color = color;
//}
//
//public static void main(String[] args) {
//	// TODO Auto-generated method stub
//	GroupAnagram x = new GroupAnagram("w");
//	x.c(x);
//	System.out.println(x.color);
//
//}
//
//public  void c(GroupAnagram y) {
//      y.color ="b";
//      System.out.println(y.color);
//    }