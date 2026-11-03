package com.itacademy.nivel3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

    private String filePath;

    public CSVReader(String filePath) {
        this.filePath = filePath;
    }

    public List<Person> readCSV() throws IOException {
        List<Person> persons = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.trim().split(",");
                Person person = new Person(data[0],data[1],data[2]);
                persons.add(person);
            }
        }

        return persons;
    }
}
