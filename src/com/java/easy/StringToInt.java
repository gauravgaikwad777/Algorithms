package com.java.easy;

public class StringToInt {
	@SuppressWarnings("null")
	public static int ParseInt(String str)
	{
		if(str==null)
			return 0;
		Boolean isNegative=false;
		if( str.charAt(0) == '-' ){
			isNegative = true;
		}
		int response = 0;
		for(char c : str.toCharArray())
		{
			if(c!='-'){
				response *= 10;
				response += c - '0';
			}
		}
		if(isNegative)
			response = -response;
		return response;
	}

	public static void main(String[] args)
	{
		String str = "-000123456789";
		System.out.println("Integer value" +
				ParseInt(str));
	}

}
