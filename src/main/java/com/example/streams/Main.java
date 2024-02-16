package com.example.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Integer[] scores = new Integer[] {80, 66, 73, 92, 43};
        Stream<Integer> scoresStream = Arrays.stream(scores);

        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("coffee");
        shoppingList.add("bread");
        shoppingList.add("pineapple");
        shoppingList.add("milk");
        shoppingList.add("pasta");
        Stream<String> shoppingListStream = shoppingList.stream();
        shoppingListStream
                .sorted()
                .map(item -> item.toUpperCase()) // Function
                .filter(item -> item.startsWith("P")) // Predicate
                .forEach(System.out::println);

        Stream<String> letterStream = Stream.of("a", "b", "c");
    }
}
