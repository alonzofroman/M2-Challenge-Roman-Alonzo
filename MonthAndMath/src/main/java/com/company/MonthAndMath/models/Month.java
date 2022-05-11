package com.company.MonthAndMath.models;

import javax.persistence.Table;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

@Table(name="months")
public class Month {
    private String name;
    private Integer number;

    public Month(String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    public Month() {
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

    public static int getRandom() {
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 12 + 1);
        return randomNumber;
    }
}
