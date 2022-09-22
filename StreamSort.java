package com.practice;

import java.util.Arrays;
import java.util.List;

public class StreamSort 
{
	public static void main(String[] args)
    {
		List<Integer> sort = Arrays.asList(90, -10, 1000, 0, 4, 79, -83);
        System.out.println("Sorted list is : ");
        sort.stream().sorted().forEach(System.out::println);
    }
}
