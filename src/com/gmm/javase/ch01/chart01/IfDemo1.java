package com.gmm.javase.ch01.chart01;

import java.util.Scanner;

/**
 * 1.需求：if示例,从键盘接收两个数字,再接收一个符号,然后进行运算
 * -------请输入第一个数字:8
 * -------请输入第二个数字:9
 * -------请输入运算符号:+
 * -------8+9=17
 */

public class IfDemo1 {
    public static void main(String[] args) {
        //输入第一个数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int num2 = sc.nextInt();
        System.out.println("请输入运算符号：");
        String op = sc.next();
        if (op.equals("+")){
            System.out.println(num1+"+"+num2+"="+(num1+num2));
        }
        else if (op.equals("-")){
            System.out.println(num1+"-"+num2+"="+(num1-num2));
        }
        else if (op.equals("*")){
            System.out.println(num1+"*"+num2+"="+(num1*num2));
        }
        else if (op.equals("/")){
            System.out.println(num1+"/"+num2+"="+(num1/num2));
        }
        else {
            System.out.println("运算符输入错误！");
        }
    }
}
