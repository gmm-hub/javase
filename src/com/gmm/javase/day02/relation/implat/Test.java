package com.gmm.javase.day02.relation.implat;

public class Test {
    public static void makeFly(AirPlan airPlan,Bird bird){
        if (airPlan.getFlyStyle()!=null)
            airPlan.fly();
        else {
            System.out.println("飞机不能起飞");
        }
        if (bird.getFlyStyle()!=null)
            bird.fly();
        else {
            System.out.println("小鸟不能起飞");
        }
    }

    public static void main(String[] args) {
        AirPlan airPlan = new AirPlan("喷气起飞");
        Bird bird = new Bird("翅膀起飞");
        makeFly(airPlan,bird);
    }
}
