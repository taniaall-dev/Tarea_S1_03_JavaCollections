package com.itacademy.nivel3;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CSVReader csvReader = new CSVReader("resources/fileCsv");

        try {
            List<Person> people = csvReader.readCSV();

            PersonManager personManager = new PersonManager(people);
            ConsoleUI consoleUI = new ConsoleUI(personManager);

            consoleUI.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}