package com.java.easy;

import java.util.Scanner;

public class RemoveDuplicatesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); System.out.println("Please enter length of String array"); 
		int length = sc.nextInt(); // create a String array to save user input 
//		String[] input = new String[length]; // loop over array to save user input 
//		System.out.println("Please enter array elements"); 
//		for (int i = 0; i < length; i++) { String userInput = sc.next(); input[i] = userInput; }
		int[] arr = {3,4,5,7,8}; 
		int c = removeDuplicates(arr);
		System.out.println("Output : " + c);

	}

    public static int removeDuplicates(int[] nums) {
        
        int counter = 1;
      
        int z=0;
        
        if (nums.length==1){
            return 1;
        }
        
        for (int j = 1; j<nums.length;j++){
            
            if (nums[j]!=nums[z]){
                  z++;
                nums[z]=nums[j];
              
            }
        }
        return z+1;
}
}
