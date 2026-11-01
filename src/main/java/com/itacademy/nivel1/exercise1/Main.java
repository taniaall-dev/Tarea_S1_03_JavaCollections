package com.itacademy.nivel1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        Month month1 = new Month("January");
        Month month2 = new Month("February");
        Month month3 = new Month("March");
        Month month4 = new Month("April");
        Month month5 = new Month("May");
        Month month6 = new Month("June");
        Month month7 = new Month("July");
        Month month8 = new Month("August");
        Month month9 = new Month("September");
        Month month10 = new Month("October");
        Month month11 = new Month("November");
        Month month12 = new Month("December");

        ArrayList<Month> monthsArrayList = new ArrayList<>();

        monthsArrayList.add(month1);
        monthsArrayList.add(month2);
        monthsArrayList.add(month3);
        monthsArrayList.add(month4);
        monthsArrayList.add(month5);
        monthsArrayList.add(month6);
        monthsArrayList.add(month7);
        monthsArrayList.add(month9);
        monthsArrayList.add(month10);
        monthsArrayList.add(month11);
        monthsArrayList.add(month12);

        HashSet<Month> monthsHashSet = new HashSet<>(monthsArrayList);

        testArrayList(monthsArrayList, month8);

        HashSet<Month> monthsHashSet = new HashSet<>(monthsArrayList);

        testHashSet(monthsHashSet, month8);

        printWithFor(monthsArrayList);

        printWithIterator(monthsHashSet);
    }

    private static void testArrayList(ArrayList<Month> months, Month month) {

        printCollection("Initial ArrayList", months);

        months.add(7, month);
        printCollection("ArrayList after inserting August at index 7", months);

        months.add(month);
        printCollection("ArrayList after adding August again", months);

        months.add(new Month("Invented month"));
        printCollection("ArrayList after adding a different month named Invented month", months);

    }

    private static void testHashSet(HashSet<Month> months, Month month) {

        printCollection("Initial HashSet", months);

        months.add(month);
        printCollection("HashSet after adding the month8 for the first time", months);

        months.add(month);
        printCollection("HashSet after attempting to add the moth8 object again", months);

        Month anotherAugust = new Month("August");
        months.add(anotherAugust);

        printCollection("HashSet after adding a new Month object with the same name as month8", months);

    }

    private static void printCollection(String message, Collection<Month> months) {

        System.out.println("\n" + message);

        for (Month month : months) {
            System.out.println(month);
        }

        System.out.println("Size: " + months.size());
    }

    private static void printWithFor(ArrayList<Month> months) {

        System.out.println("\nTraversing ArrayList with a for loop:");

        for (Month month : months) {
            System.out.println(month);
        }
    }

    private static void printWithIterator(Collection<Month> months) {

        System.out.println("\nTraversing HashSet with an Iterator:");

        Iterator<Month> iterator = months.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}