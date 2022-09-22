package com.practice;

import java.util.Arrays;
import java.util.List;

public class StreamAnyBoolean 
{
	public static void main(String[] args) 
	{
	    List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);
	    boolean ans = list.stream().anyMatch(n -> (n % 2 == 0) );
	    System.out.println(ans);
	}
}
