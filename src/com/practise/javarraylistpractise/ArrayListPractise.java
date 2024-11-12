package com.practise.javarraylistpractise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListPractise {
    public static void main(String []args){
        List<String> test= Arrays.asList("santosh","kumar","Singh");
        List<String> modified=test.stream().filter((temp)->temp.length()>5).map((temp)->{
            temp="hell0";
            return temp.toUpperCase();
        }).collect(Collectors.toList());
        System.out.println(test);
        System.out.println(modified);
        System.out.println("uploaded");
    }
}
