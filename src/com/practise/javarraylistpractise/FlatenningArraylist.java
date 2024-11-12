package com.practise.javarraylistpractise;

import java.util.Arrays;
import java.util.List;

public class FlatenningArraylist {
    public static void main(String args[]){
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("i", "want"),
                Arrays.asList("to", "go Delhi at the end of this month"),
                Arrays.asList("what", "about you")
        );

        // Using Stream flatMap(Function mapper)
        listOfLists.stream()
                .flatMap(list -> list.stream()).map(temp->temp.toUpperCase())
                .forEach(System.out::println);
    }
}
