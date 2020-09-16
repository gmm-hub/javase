package com.gmm.javase.day03.mapdemo;

import java.util.Comparator;
import java.util.Objects;

public class IntegerDemo  { //implements Comparator
    private int i;

    public IntegerDemo() {
    }

    public IntegerDemo(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "IntegerDemo{" +
                "i=" + i +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntegerDemo that = (IntegerDemo) o;
        return i == that.i;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i);
    }
}
