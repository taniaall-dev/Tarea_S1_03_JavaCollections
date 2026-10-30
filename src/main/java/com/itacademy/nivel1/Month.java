package com.itacademy.nivel1;

public class Month {
    String name;

    public Month(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Month " +
                "name = '" + name + '\'';
    }

}
