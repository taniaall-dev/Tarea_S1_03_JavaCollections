package com.itacademy.nivel3;

public class Person {
    private String name;
    private String surnames;
    private String ID;

    public Person(String nom, String surnames, String ID) {
        this.name = nom;
        this.surnames = surnames;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public String getSurnames() {
        return surnames;
    }

    public String getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nom='" + name + '\'' +
                ", cognom='" + surnames + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }
}
