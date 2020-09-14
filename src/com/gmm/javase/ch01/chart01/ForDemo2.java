package com.gmm.javase.ch01.chart01;
//2.在屏幕上打印出n行的金字塔图案，如，若n=5,则图案如下：
//        *
//       ***
//      *****
//     *******
//    *********
//        拓展：打印输出
//        A
//        BBB
//        CCCCC
//        DDDDDDD
//        EEEEEEEEE

import java.util.Scanner;

public class ForDemo2 {
    public static void main(String[] args) {
        //获取输入n的的值
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入n的值:");
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i-1;j++)
                System.out.printf(" ");
            for(int m = 0;m<2*i+1;m++)
                System.out.printf("*");
            System.out.println();
        }
    }
}
