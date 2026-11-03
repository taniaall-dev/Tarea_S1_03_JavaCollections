package com.itacademy.nivel3;

public class Person {
    private String name;
    private String surnames;
    private String ID;

    public Person(String name, String surnames, String ID) {
        this.name = name;
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
        return "- " +
                "NAME: '" + name + '\'' +
                ",SURNAME:'" + surnames + '\'' +
                ",ID='" + ID + '\'' +
                '.';
    }
}
