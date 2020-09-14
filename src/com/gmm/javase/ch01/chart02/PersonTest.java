package com.gmm.javase.ch01.chart02;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(30);
        person.setGender(true);
        person.setName("张三");
        Person person1 = new Person();
        person1.setName("李四");
        person1.setGender(false);
        person1.setAge(25);
        person.marry(person1);
    }
}
