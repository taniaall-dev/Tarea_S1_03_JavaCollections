package com.itacademy.nivel1.exercise3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class FileManager {

    public HashMap<String, String> readCountries(String path) throws IOException {
        HashMap<String, String> countries = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.trim().split("\\s+");

                if (data.length == 2) {
                    String country = data[0];
                    String capital = data[1];

                    countries.put(country, capital);
                }
            }
        }

        return countries;
    }


}
