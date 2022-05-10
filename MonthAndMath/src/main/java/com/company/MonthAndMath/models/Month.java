package com.company.MonthAndMath.models;

import java.util.Objects;

public class Month {
    private String name;
    private Integer number;

    public Month(String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Month month = (Month) o;
        return Objects.equals(name, month.name) && Objects.equals(number, month.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }
}
