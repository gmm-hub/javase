package com.gmm.javase.ch01.chart01;
//3.乘法口诀表；（for）
public class ForDemo3 {
    public static void main(String[] args) {
        for (int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.printf(j+"*"+i+"="+i*j+"  ");
            }
            System.out.println();
        }
    }
}
