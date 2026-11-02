package com.itacademy.nivel2.exercise1and2;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        HashSet<Restaurant> restaurants = new HashSet<>();

        Collections.addAll(restaurants,
                new Restaurant("La tagliatella", 3),
                new Restaurant("La tagliatella", 10),
                new Restaurant("La tagliatella", 7),
                new Restaurant("Mcdonalds", 9),
                new Restaurant("Mcdonalds", 9),
                new Restaurant("DiverXO", 7)
        );

        System.out.println("Before sort");
        for (Restaurant restaurant : restaurants) {
            System.out.println(restaurant);
        }

        System.out.println("After sort");

        List<Restaurant> sortedList = restaurants.stream().sorted().toList();

        for (Restaurant restaurant : sortedList) {
            System.out.println(restaurant);
        }
    }
}
