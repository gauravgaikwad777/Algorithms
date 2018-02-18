package com.java.easy;

import java.util.Scanner;

public class PalindromeCheck {
	public static void main(String[] args) {
		
		System.out.println("Please enter");
		Scanner in = new Scanner (System.in);
		int s = in.nextInt();
		Boolean c = isPalindrome(s);
		System.out.println("Output : " + c.toString());

	}

	public static Boolean isPalindrome(int x) {
        int r, sum =0,temp;
        temp = x;
        while(x>0){
        	r=x%10;
        	sum = (sum*10)+r;
        	x=x/10;
        }
        if(temp==sum)
        	return true;
        return false;
    }
}
