package com.java.easy;

public class PrimeCount {
	public static int countPrimes(int n) {
        int[] a = new int[n];
        int count =0, j=0;
        
        for(int i=2; i<n; i++){
            if(a[i]!=-1){
                ++count;
                j = 2*i;
                while(j<n){
                    a[j] = -1;
                    j+=i;
                }
            }
        }
        return count;
    }
	public static void main (String args[])
	{
		int n = 5;
		System.out.println(countPrimes(n));
	}
}
