package com.itacademy.nivel1.exercise3;

public class Main {

    public static void main (String[] args) {

        CapitalGame capitalGame = new CapitalGame();

        try {
            capitalGame.startGame();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
