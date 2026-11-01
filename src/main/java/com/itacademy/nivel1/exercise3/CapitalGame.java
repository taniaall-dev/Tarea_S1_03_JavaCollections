package com.itacademy.nivel1.exercise3;

import com.itacademy.nivel1.ConsoleReader.ConsoleReader;

import java.util.*;

public class CapitalGame {

    private final HashMap<String, String> countries;
    private String playerName;
    private int score;

    public CapitalGame(HashMap<String, String> countries) {
        if(countries == null) {
            throw new IllegalArgumentException("Countries cannot be null.");
        }
        this.countries = countries;
        this.playerName = "";
        this.score = 0;
    }

    public void startGame() {
        askPlayerName();
        playRounds();
        showFinalScore();
    }

    private void askPlayerName() {
        playerName = ConsoleReader.readString("Enter your username: ");
    }

    private void validateCountries(List<String> countryList) {
        if (countryList.size() < 10) {
            throw new IllegalArgumentException("There must be at least 10 countries on the list");
        }
    }

    private void playRounds() {
        List<String> countryList = new ArrayList<>(countries.keySet());

        validateCountries(countryList);

        Collections.shuffle(countryList);

        score = 0;

        for (int i = 0; i < 10; i++) {
            String country = countryList.get(i);

            String answer = ConsoleReader.readString("What is the capital of " + country + "? ");

            String correctCapital = countries.get(country);

            if (answer.trim().equalsIgnoreCase(correctCapital)) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect. The correct answer is " + correctCapital);
            }
        }
    }

    private void showFinalScore() {
        System.out.println(playerName + ", your final score is: " + score + "/10");
    }
}
