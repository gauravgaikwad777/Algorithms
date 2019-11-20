package com.java.easy;

public class SingularNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,2,3,4,3,1, 4};
		singularNumber(a);

	}
	
	public static int singularNumber(int[] num) {
		int ans = 0;
		for (int i=0; i!=num.length; i++) {
			ans ^= num[i];
		}
		System.out.println(ans);
		return ans;
		
	}

}
