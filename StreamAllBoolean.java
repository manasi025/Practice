package com.practice;

import java.util.Arrays;
import java.util.List;

public class StreamAllBoolean 
{
	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(3, 4, 6, 12, 21);
	    boolean ans = list.stream().allMatch(n -> (n % 2 == 0) );
	    System.out.println(ans
	    		);
	}
}
