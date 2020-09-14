package com.gmm.javase.ch01.chart01;

import java.util.Scanner;

//1.输入学员的考试成绩，输出这学员考试成绩的级别。
//        100      A级
//        90~99    A级
//        80~89    B级
//        70~79    C级
//        60~69    D级
//< 60     不合格
public class SwitchDemo {
    public static void main(String[] args) {
        //输入学员考试成绩
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生成绩：");
        double grade = sc.nextDouble();
        //判断成绩级别并输入
        int level = (int)(grade/10);
        switch (level){
            case 10:
            case 9:
                System.out.println("该学生成绩等级为A级");
                break;
            case 8:
                System.out.println("该学生成绩等级为B级");
                break;
            case 7:
                System.out.println("该学生成绩等级为C级");
                break;
            case 6:
                System.out.println("该学生成绩等级为D级");
                break;
            default:
                System.out.println("该学生成绩等级不合格");
                break;
        }
    }
}
