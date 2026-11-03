package com.itacademy.nivel3;

import com.itacademy.nivel1.ConsoleReader.ConsoleReader;

import java.util.List;

public class ConsoleUI {

    private PersonManager personManager;

    public ConsoleUI(PersonManager personManager) {
        this.personManager = personManager;
    }

    public void start() {

        while (true) {
            showMenu();

            byte optionChosen = ConsoleReader.readByte("Choose an option: ");

            switch (optionChosen) {
                case 1 -> {
                    String name = ConsoleReader.readString("Enter a name: ");
                    String surnames = ConsoleReader.readString("Enter surnames: ");
                    String id = ConsoleReader.readString("Enter an ID: ");
                    Person person = new Person(name, surnames, id);
                    personManager.addPerson(person);
                    System.out.println("Person entered correctly");
                }
                case 2 -> {
                    List<Person> personListNameAsc = personManager.sortByNameAsc();
                    personManager.showListPerson(personListNameAsc);
                }
                case 3 -> {
                    List<Person> personListNameDesc = personManager.sortByNameDesc();
                    personManager.showListPerson(personListNameDesc);
                }
                case 4 -> {
                    List<Person> personListSurnameAsc = personManager.sortBySurnamesAsc();
                    personManager.showListPerson(personListSurnameAsc);
                }
                case 5 -> {
                    List<Person> personListSurnameDesc = personManager.sortBySurnamesDesc();
                    personManager.showListPerson(personListSurnameDesc);
                }
                case 6 -> {
                    List<Person> personListIdAsc = personManager.sortByIdAsc();
                    personManager.showListPerson(personListIdAsc);
                }
                case 7 -> {
                    List<Person> personListIdDesc = personManager.sortByIdDesc();
                    personManager.showListPerson(personListIdDesc);
                }
                case 0 -> {
                    System.out.println("See you soon!");
                    return;
                }
                default -> {
                    System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }

    public void showMenu() {
        System.out.println(" --- Menu --- ");
        System.out.println(
                "1. Enter person.\n" +
                        "2. Show people sorted by name (A-Z).\n" +
                        "3. Show people sorted by name (Z-A).\n" +
                        "4. Show people sorted by surname (A-Z).\n" +
                        "5. Show people sorted by surname (Z-A).\n" +
                        "6. Show people sorted by ID (1-9).\n" +
                        "7. Show people sorted by ID (9-1).\n" +
                        "0. Exit."
        );
    }
}
