package com.java.easy;

public class MaxSubArray {
	public static int maxSubArray(int[] nums) {
	    //Kadane's algorithm
	        int max = Integer.MIN_VALUE; //overall max //Integer.MIN_VALUE = -2 ^ 31
	        int sum = 0; //current sum

	        for (int i = 0; i < nums.length; i++) {
	            sum += nums[i];
	            if (max < sum) { //if current sum > max, assign max = sum
	                max = sum;
	            }
	            if (sum < 0) { //if current sum < 0 start new sum
	                sum = 0;
	            }
	        }
	        return max;
	    }

	public static void main(String[] args) {

		int[] s = {-3,-4,-6,-6,-19,-2, -3, -2, -2, -1};
		int c = maxSubArray(s);
		System.out.println("Output : " + c);

	}
}
