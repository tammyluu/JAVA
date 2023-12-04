package org.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        //testLimit();
        testDistinct();
    }
    public static void testLimit()
    {
       List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> results = numbers.stream().filter(i -> {
            System.out.println("Filter: " + i);
            return i > 4;
        }).limit(3).toList();

        System.out.println("Result of limit: " + results);
    }
    	public static void testDistinct (){
            List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 5, 1, 7, 2);
            List<Integer> results = numbers.stream().distinct().collect(Collectors.toList());
            System.out.println("Before distinct: " + numbers);


            System.out.println("Result of distinct: " + results);
        }



}


