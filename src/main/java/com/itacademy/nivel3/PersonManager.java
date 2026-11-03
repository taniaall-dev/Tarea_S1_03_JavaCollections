package com.itacademy.nivel3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PersonManager {

    private final List<Person> personsList = new ArrayList<>();

    public PersonManager(List<Person> personsList) {
        this.personsList.addAll(personsList);
    }

    public void addPerson (Person person) {
        personsList.add(person);
    }

    public void showListPerson(List<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    public List<Person> sortByNameAsc() {
        List<Person> sortedPersonList = new ArrayList<>(personsList);

        Comparator<Person> comparatorByName = (p1,p2)->p1.getName().compareTo(p2.getName());
        sortedPersonList.sort(comparatorByName);
        return sortedPersonList;
    }

    public List<Person> sortByNameDesc() {
        List<Person> sortedPersonList = new ArrayList<>(personsList);

        Comparator<Person> comparatorByName = (p1,p2)->p1.getName().compareTo(p2.getName());
        sortedPersonList.sort(comparatorByName.reversed());

        return sortedPersonList;
    }

    public List<Person> sortBySurnamesAsc() {
        List<Person> sortedPersonList = new ArrayList<>(personsList);

        Comparator<Person> comparatorBySurnames = (p1,p2)->p1.getSurnames().compareTo(p2.getSurnames());
        sortedPersonList.sort(comparatorBySurnames);

        return sortedPersonList;
    }

    public List<Person> sortBySurnamesDesc() {
        List<Person> sortedPersonList = new ArrayList<>(personsList);

        Comparator<Person> comparatorBySurnames = (p1,p2)->p1.getSurnames().compareTo(p2.getSurnames());
        sortedPersonList.sort(comparatorBySurnames.reversed());
        return sortedPersonList;
    }

    public List<Person> sortByIdAsc() {
        List<Person> sortedPersonList = new ArrayList<>(personsList);

        Comparator<Person> comparatorById = (p1,p2)->p1.getID().compareTo(p2.getID());
        sortedPersonList.sort(comparatorById);

        return sortedPersonList;
    }


    public List<Person> sortByIdDesc() {
        List<Person> sortedPersonList = new ArrayList<>(personsList);

        Comparator<Person> comparatorByName = (p1,p2)->p1.getID().compareTo(p2.getID());
        sortedPersonList.sort(comparatorByName.reversed());

        return sortedPersonList;
    }
}
