package com.java.easy;

public class MaxProfitStocks {
	public static void main(String[] args) {

		int[] s = {0,3,4,-6,6,19,0,2};
		int c = isAnagram(s);
		System.out.println("Output : " + c);

	}

	public static int isAnagram(int price[]) {
		
		if (price == null)
			return 0;
		int min = Integer.MAX_VALUE, max=0;
		
		for (int i=0; i<price.length;i++){
			if(price[i]<min)
				min = price[i];
			else if(price[i]-min>max)
				max=price[i]-min;
		}
		return max;
	}
}
