package com.java.easy;

public class reverseInteger {
	public int reverse(int x) {
        int rev = 0 ;
        boolean flag = false;
        if (x<0){
            x = Math.abs(x);
            flag = true;
        }
        while(x != 0){
            rev = rev*10+x%10;
            x=x/10;
        }
        if (flag = true){
            rev = 0 - rev;
        }
        return rev;
    }
}
