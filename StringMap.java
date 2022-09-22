package com.practice;

import java.util.Arrays;
import java.util.List;

public class StringMap 
{
	public static void main(String[] args)
    {
        List<String> list = Arrays.asList("Nashik", "Blue", "elephant");
        System.out.println("Character count of word in given strings are : ");
        list.stream().map(str -> str.length()).forEach(System.out::println);
    }
}


