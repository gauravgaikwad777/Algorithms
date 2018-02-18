package com.java.easy;

import java.util.Scanner;

public class AnagramCheck {

	public static void main(String[] args) {
		
//		System.out.println("Please enter");
//		Scanner in = new Scanner (System.in);
		String s = "yargs";
		String t = "yrgas";
		Boolean c = isAnagram(s,t);
		System.out.println("Output : " + c.toString());

	}
	
	public static boolean isAnagram(String s, String t) {
	    if (s.length() != t.length()) {
	        return false;
	    }
	    int[] counter = new int[26];
	    for (int i = 0; i < s.length(); i++) {
	        counter[s.charAt(i) - 'a']++;
	        counter[t.charAt(i) - 'a']--;
	        System.out.println("S : "+counter[s.charAt(i) - 'a']++);
	        System.out.println("T : "+counter[t.charAt(i) - 'a']--);
	    }
	    for (int count : counter) {
	    	System.out.println(count);
	        if (count != 0) {
	            return false;
	        }
	    }
	    return true;
	}
}
