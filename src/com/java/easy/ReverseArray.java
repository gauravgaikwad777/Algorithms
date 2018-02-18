package com.java.easy;

public class ReverseArray {
	////// 
	public static int[] reverseArray(int[] array) {
		for(int i=0; i<array.length/2; i++){ 
			int temp = array[i]; 
			array[i] = array[array.length -i -1]; 
			array[array.length -i -1] = temp; 
		}
		return array;
	}
	//////
	public static String reverseStr(String s) {
		if (s == null || s.length() == 0) {
            return "";
        }
        char[] arr = s.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = arr.length - 1;i >= 0 ; i--) {
            builder.append(arr[i]);
        }
        return builder.toString();

	}
	
	static void printArray(int arr[]){
		int i;
		for (i=0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
	}
	public static void main (String[] args) {
		int arr[] = {1,3,6,7};
		printArray(arr);
		reverseArray(arr);
		printArray(arr);
		
		String str = "Hello";
		System.out.println("Reverse of "+ str+" : "+ reverseStr(str));
		
	}
}
