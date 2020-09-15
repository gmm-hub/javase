package com.gmm.javase.day02.abstracts.implat;

public class AirPlan implements CanFly {
    private String flyStyle;


    public AirPlan() {
    }

    public AirPlan(String flyStyle) {
        this.flyStyle = flyStyle;
    }

    public String getFlyStyle() {
        return flyStyle;
    }

    public void setFlyStyle(String flyStyle) {
        this.flyStyle = flyStyle;
    }

    @Override
    public void fly() {
        System.out.println("飞机起飞方式："+flyStyle);
    }
}
