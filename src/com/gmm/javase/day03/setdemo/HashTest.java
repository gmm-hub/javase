package com.gmm.javase.day03.setdemo;

import java.util.HashSet;
import java.util.Set;

public class HashTest {

    public static void main(String[] args) {
        Set<PersonHash> person = new HashSet<PersonHash>();

        PersonHash personHash1 = new PersonHash("aab",13,'男');
        PersonHash personHash2 = new PersonHash("aaa",19,'女');
        PersonHash personHash3 = new PersonHash("aad",18,'女');
        PersonHash personHash4 = new PersonHash("aab",13,'男');

        person.add(personHash1);
        person.add(personHash2);
        person.add(personHash3);
        person.add(personHash4);

        for (PersonHash personHash : person) {
            System.out.println(personHash);
        }
    }
}
