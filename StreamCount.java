package com.practice;

import java.util.Arrays;
import java.util.List;

public class StreamCount 
{
	public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(90, -10, 1000, 0, 4, 79, -83);
        long total = list.stream().count();
        System.out.println("Total count of elements is : "+ total);
    }
}
