package com.java.easy;

import java.util.Scanner;
public class ReverseInt {

	public static void main(String[] args) {
		
		System.out.println("Please enter");
		Scanner in = new Scanner (System.in);
		int s = in.nextInt();
		int c = reverse(s);
		System.out.println("Output : " + c);

	}

	public static int reverse(int x) {
        int rev = 0 ;
        boolean flag = false;
        if (x<0){
            x = Math.abs(x);
            flag = true;
            System.out.println( "here");
        }
        while(x != 0){
            rev = rev*10+x%10;
            x=x/10;
            System.out.println( x);
        }
        System.out.println( rev);
        if (flag == true){
            rev = 0 - rev;
        }
        return rev;
    }
}
