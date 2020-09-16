package com.gmm.javase.day03.setdemo;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemoTest {
    public static void main(String[] args) {
        //方法二让迭代器可以比较
        Set<Person> people = new TreeSet<Person>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                //判断姓名是否一样
                if (o1.getName().equals(o2.getName()))
                {
                    //判断年龄
                    if (o1.getAge()==o2.getAge()){
                        //判断性别
                        return ((Character)(o1.getGender())).compareTo(o2.getGender());
                    }
                    return o2.getAge()-o1.getAge();
                }
                return o2.getName().compareTo(o1.getName());
            }
        });
        Person person1 = new Person("aab",20,'男');
        Person person2 = new Person("aad",26,'女');
        Person person3 = new Person("aac",10,'男');
        Person person4 = new Person("aab",30,'女');
        Person person5 = new Person("aab",30,'男');

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
