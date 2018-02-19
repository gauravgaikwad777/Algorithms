package com.java.easy;

public class ReverseFactorial {

    public static String reverseFactorial(int n) {
        int number = n;
        int divisor = 2;
        while (number % divisor == 0) {
            number /= divisor;
            divisor++;
        }
        return String.format("%d = ", n) + ((divisor % number == 0) ? String.format("%d!", divisor - 1) : "NONE");

    }
		public static void main (String args[])
		{
			System.out.println(reverseFactorial(3628800));
	        System.out.println(reverseFactorial(479001600));
	        System.out.println(reverseFactorial(6));
	        System.out.println(reverseFactorial(120));
	        System.out.println(reverseFactorial(18));
		}
	}
