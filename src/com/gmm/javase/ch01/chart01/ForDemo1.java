package com.gmm.javase.ch01.chart01;

//1、猜数字的游戏(GuessNumber)
//        游戏运行时产生一个1－100之间的随机整数，要求用户从控制台输入数字，
//        若输入的数字比产生的数字小，则输出：“太小了，再大一点！”；
//        若输入的数字比产生的数字大，则输出：“太大了，再小一点！”，
//        若输入的数字和产生的数字相等，则输出：“恭喜你猜对了！”，
//        若用户猜了7次还未猜对，则输出：“你太笨了，下次再来吧！”然后退出程序。
//        提示：
//        (1)、int num=(int)(Math.random()*100); //java.lang.Math;
//        (2)、Scanner in=new Scanner(System.in); // java.util.Scanner;
//        int n = in.nextInt();

import java.util.Scanner;

public class ForDemo1 {
    public static void main(String[] args) {
        //输入数字
        int num=(int)(Math.random()*100); //java.lang.Math;
        Scanner in=new Scanner(System.in); // java.util.Scanner;
        int i = 0;
        while (true){
            System.out.println("请输入一个整数：");
            int n = in.nextInt();
            if (n>num){
                System.out.println("太大了，再小一点！");
                i++;
            }
            else if (n<num){
                System.out.println("太小了，再大一点！");
                i++;
            }
            else {
                System.out.println("恭喜你猜对了！");
                break;
            }
            if (i>=7){
                System.out.println("你太笨了，下次再来吧！");
                break;
            }
        }
    }
}
