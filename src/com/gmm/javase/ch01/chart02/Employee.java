package com.gmm.javase.ch01.chart02;

//
//2.现有员工Employee类，有姓名，地址，基本工资属性，
//        董事类和经理类除以上属性，董事类有交通补助，经理类有所管部门，
//        三个类中都有显示其基本信息的方法show，但其实现方式不同，
//        请写出各类构造方法，及属性的get，set方法。
//        并要用到this和super关键字。

public class Employee {
    private String name;
    private String addr;
    private String salory;

    public Employee(String name, String addr, String salory) {
        this.name = name;
        this.addr = addr;
        this.salory = salory;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getSalory() {
        return salory;
    }

    public void setSalory(String salory) {
        this.salory = salory;
    }
    public void show(){
        System.out.println("姓名："+this.name);
        System.out.println("地址："+this.addr);
        System.out.println("薪水："+this.salory);
    }
}
