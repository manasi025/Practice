package com.practice;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamObjToArray 
{
	public static void main(String[] args) 
	{
		Stream<String> cities = Stream.of("Mumbai", "Nashik", "Pune", "Mathura", "Mangalore");
		Object[] arr = cities.filter(str -> str.startsWith("M"+ "")).toArray();
		System.out.println(Arrays.toString(arr));
	}
}
