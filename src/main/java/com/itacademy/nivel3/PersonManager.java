package com.itacademy.nivel3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PersonManager {

    private final List<Person> people = new ArrayList<>();
    private List<Person> sortedPersonList = new ArrayList<>();
    private final Comparator<Person> comparatorByName = (p1,p2)->p1.getName().compareToIgnoreCase(p2.getName());
    private final Comparator<Person> comparatorBySurnames = (p1,p2)->p1.getSurnames().compareToIgnoreCase(p2.getSurnames());
    private final Comparator<Person> comparatorById = (p1,p2)->p1.getID().compareToIgnoreCase(p2.getID());

    public PersonManager(List<Person> people) {
        this.people.addAll(people);
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public void showListPerson(List<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }

    public List<Person> sortByNameAsc() {
        sortedPersonList = new ArrayList<>(people);
        sortedPersonList.sort(comparatorByName);
        return sortedPersonList;
    }

    public List<Person> sortByNameDesc() {
        sortedPersonList = new ArrayList<>(people);
        sortedPersonList.sort(comparatorByName.reversed());
        return sortedPersonList;
    }

    public List<Person> sortBySurnamesAsc() {
        sortedPersonList = new ArrayList<>(people);
        sortedPersonList.sort(comparatorBySurnames);
        return sortedPersonList;
    }

    public List<Person> sortBySurnamesDesc() {
        sortedPersonList = new ArrayList<>(people);
        sortedPersonList.sort(comparatorBySurnames.reversed());
        return sortedPersonList;
    }

    public List<Person> sortByIdAsc() {
        sortedPersonList = new ArrayList<>(people);
        sortedPersonList.sort(comparatorById);
        return sortedPersonList;
    }


    public List<Person> sortByIdDesc() {
        sortedPersonList = new ArrayList<>(people);
        sortedPersonList.sort(comparatorById.reversed());
        return sortedPersonList;
    }
}
