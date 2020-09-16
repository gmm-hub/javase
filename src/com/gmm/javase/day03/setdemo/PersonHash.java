package com.gmm.javase.day03.setdemo;

import java.util.Objects;

public class PersonHash {
    private String name;
    private int age;
    private char gender;

    public PersonHash() {
    }

    public PersonHash(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "PersonHash{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonHash that = (PersonHash) o;
        return age == that.age &&
                gender == that.gender &&
                name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }
}
