package com.thoughtworks.collection;

import java.util.List;
import java.util.stream.Collectors;

public class StreamReduce {

    public int getLastOdd(List<Integer> numbers) {
        return numbers
                .stream()
                .filter(num -> num % 2 == 1)
                .reduce((accumalator, num) -> num)
                .get();
    }

    public String getLongest(List<String> words) {

        return words
                .stream()
                .reduce((accumalator, word) -> accumalator.length() > word.length() ? accumalator : word).get();

    }

    public int getTotalLength(List<String> words) {
        return words.stream().mapToInt(String::length).reduce(0, Integer::sum);
    }
}
