package com.gmm.javase.ch01.chart02;

/*
 * 1.该实例为定义一个成绩计算类。
类中包含的内容有：
  1、三个float类型的成员属性（Java成绩、C#成绩、数据库成绩）；
  2、对三个私有属性的公开的getter/setter方法；
  3、一个无参的构造方法和一个带参数的构造方法；
  4、计算三个科目的平均值的方法；
  5、计算三个科目的总成绩的方法；
  6、程序入口main方法。

在main中分别通过有参和无参的构造方法实例化成绩计算类的对象实体并传入成绩参数。
再通过对象调用计算平均值和总成绩的方法打印输出。
在计算平均值和总成绩的方法中，分别获取到属性的值进行计算。
 */

public class GradeDemo {
    private float java_score;
    private float c_score;
    private float data_score;

    public GradeDemo(float java_score, float c_score, float data_score) {
        this.java_score = java_score;
        this.c_score = c_score;
        this.data_score = data_score;
    }

    public GradeDemo() {
    }

    public float getJava_score() {
        return java_score;
    }

    public void setJava_score(float java_score) {
        this.java_score = java_score;
    }

    public float getC_score() {
        return c_score;
    }

    public void setC_score(float c_score) {
        this.c_score = c_score;
    }

    public float getData_score() {
        return data_score;
    }

    public void setData_score(float data_score) {
        this.data_score = data_score;
    }
    public void showAverage(){
        float average = (this.c_score+this.data_score+this.java_score)/3;
        System.out.println("平均成绩为："+average);
    }
    public void showSum(){
        float sum = this.c_score+this.data_score+this.java_score;
        System.out.println("总成绩为："+sum);
    }

    public static void main(String[] args) {
        GradeDemo grade = new GradeDemo(80.6f,90.4f,60.0f);
        grade.showAverage();
        grade.showSum();
    }
}
