package com.gmm.javase.ch01.chart01;

import java.util.Scanner;

/**
 * 3.需求：应征入伍： 条件：男，身高170厘米以上，20--26周岁
 * 女，身高162厘米以上，20---22周岁之间
 * 从键盘输入性别，年龄以及身高，判断是否可以应征入伍！
 */

public class IfDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入入伍数据
        System.out.println("请输入性别：");
        String sex = sc.next();
        System.out.println("请输入身高：");
        int high = sc.nextInt();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        //判断是否符合入伍条件
        if (sex.equals("男")&&high>=170&&age>=20&&age<=26){
            //输出结果
            System.out.println("符合应征入伍条件");
        }
        else if (sex.equals("女")&&high>=162&&age>=20&&age<=22){
            System.out.println("符合应征入伍条件");
        }
        else {
            System.out.println("不符合应征入伍条件");
        }

    }
}
