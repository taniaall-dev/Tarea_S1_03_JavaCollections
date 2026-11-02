package com.itacademy.nivel2.exercise1and2;

import java.util.Objects;

public class Restaurant implements Comparable<Restaurant>{
    private String nom;
    private int score;

    public Restaurant(String nom, int score) {
        this.nom = nom;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Restaurant {" +
                "nom = '" + nom + '\'' +
                ", score = " + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return score == that.score && Objects.equals(nom, that.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, score);
    }

    @Override
    public int compareTo(Restaurant o) {

        int result = this.nom.compareTo(o.nom);

        if(result == 0) {
            return Integer.compare(o.score, this.score);
        }

        return result;
    }
}
