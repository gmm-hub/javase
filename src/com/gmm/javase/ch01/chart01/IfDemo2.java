package com.gmm.javase.ch01.chart01;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 2.需求：飞机票在淡季是有优惠政策的,而放假期间是没有优惠的，
 * 假设在元旦三天（1.01---1.03），
 * 五一三天（5.01---5.03），
 * 十一七天（10.01---10.07）无任何优惠，
 * 除了以上13天，都打8折， 请输入您哪天订票，以及票价（自己设定一个吧），
 * 输出应付多少钱？
 */

public class IfDemo2 {
    public static void main(String[] args) {
        //1.输入订票日期，以及票价
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入订票日期： ---格式：1.02");
        String date = sc.next();
        System.out.println("请输入票价：");
        double price = sc.nextDouble();
        List<String> dates = Arrays.asList("1.01","1.02","1.03","5.01","5.02","5.03","10.01","10.02","10.03","10.04","10.05","10.06","10.07");
        //2.判断条件
        if (dates.contains(date)){
            //3.输出价格
            System.out.println("应付钱数："+price);

        }
        else {
            System.out.println("应付钱数："+price*0.8);
        }

    }
}
