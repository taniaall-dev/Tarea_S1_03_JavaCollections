package com.itacademy.nivel1.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorExercise {
    private final List<Integer> numbers = new ArrayList<>();
    private final List<Integer> reverseNumbers = new ArrayList<>();

    public void fillNumbers() {
        numbers.clear();

        getNumbers().addAll(List.of(1,2,3,4,5,6,7,8,9,10));
    }

    public void invertElements () {
        reverseNumbers.clear();

        ListIterator<Integer> iterator = getNumbers().listIterator(getNumbers().size());

        while(iterator.hasPrevious()) {
            Integer number = iterator.previous();
            getReverseNumbers().add(number);
        }
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public List<Integer> getReverseNumbers() {
        return reverseNumbers;
    }
}
