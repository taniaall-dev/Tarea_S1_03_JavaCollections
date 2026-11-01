package com.itacademy.nivel1.exercise2;

public class Main {

    public static void main (String[] args) {

        IteratorExercise iteratorExercise = new IteratorExercise();
        iteratorExercise.fillNumbers();
        iteratorExercise.invertElements();
        System.out.println("Original list: " + iteratorExercise.getNumbers());
        System.out.println("Reversed list: " + iteratorExercise.getReverseNumbers());
    }
}
