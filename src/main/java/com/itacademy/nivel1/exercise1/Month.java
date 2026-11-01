package com.itacademy.nivel1.exercise1;

import java.util.Objects;

public class Month {
    String name;

    public Month(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Month month = (Month) o;
        return Objects.equals(name, month.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "Month " +
                "name = '" + name + '\'';
    }

}
