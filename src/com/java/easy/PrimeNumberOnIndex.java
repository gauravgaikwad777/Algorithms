package com.java.easy;

public class PrimeNumberOnIndex {

	public static int PrimeOnIndex(int n) {
		int i = 2, flag;
		int count = 0;
		while (i != 0) {
			flag = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					flag++;
			}
			if (flag == 0 && count < n) {
				count++;
			}
			if (count == n) {
				break;
			}
			i++;
		}
		return i;
	}

	public static void main(String[] args) {
		int n = 5;
		System.out.println("Prime value: " + PrimeOnIndex(n));
	}
}
