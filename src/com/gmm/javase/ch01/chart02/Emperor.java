package com.gmm.javase.ch01.chart02;

/*
 * 2.封装一个皇帝类，里面有姓名，在位时间，政绩，描述4个属性，
 * 提供一个方法用来显示所有属性，私有化这些属性并提供对应的get以及set方法，
 * 并在测试类中测试。
 */
public class Emperor {
    private String name;
    private int data_year;
    private String policy;
    private String clear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getData_year() {
        return data_year;
    }

    public void setData_year(int data_year) {
        this.data_year = data_year;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public String getClear() {
        return clear;
    }

    public void setClear(String clear) {
        this.clear = clear;
    }

    public Emperor() {
    }

    public Emperor(String name, int data_year, String policy, String clear) {
        this.name = name;
        this.data_year = data_year;
        this.policy = policy;
        this.clear = clear;
    }
    public void show(){
        System.out.println("皇帝的姓名："+this.name);
        System.out.println("皇帝的在位时间："+this.data_year+"年");
        System.out.println("皇帝的政绩："+this.policy);
        System.out.println("皇帝的描述："+this.clear);
    }
}


