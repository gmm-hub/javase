package com.gmm.javase.ch01.chart02;

/**
 * 1.写一个类Person,包含以下属性：
 String  name;
 int  age;
 boolean  gender;  //性别  true男  false女
 Person  partner;  //伴侣
 为Person类写一个marry(Person  p)方法，代表当前对象和p结婚，如若可以结婚，则输出恭贺信息，
 否则输出不能结婚原因。要求在另外一个类中写一个主方法，来测试以上程序。
 （下列情况不能结婚：1，同性；2，未达到结婚年龄，男<24，女<22；3，某一方已婚）
 */

public class Person {
    private String  name;
    private int  age;
    private boolean  gender;  //性别  true男  false女
    private Person  partner;  //伴侣

    public Person() {
    }

    public Person(String name, int age, boolean gender, Person partner) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.partner = partner;
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

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Person getPartner() {
        return partner;
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }
    public void marry(Person  p){
        if(this.gender==p.gender){
            System.out.println("同性不能结婚");
        }
        else if((this.gender&&this.age<24)||(p.gender&&p.age<24)){
            System.out.println("男性小于24岁，不能结婚");
        }
        else if ((!this.gender&&this.age<22)||(!p.gender&&p.age<22)){
            System.out.println("女性小于22岁，不能结婚");
        }
        else if (p.partner!=null||this.partner!=null){
            System.out.println("已婚");
        }
        else {
            System.out.println("恭贺新婚！");
        }
    }
}
