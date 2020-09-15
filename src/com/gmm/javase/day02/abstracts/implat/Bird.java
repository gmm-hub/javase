package com.gmm.javase.day02.abstracts.implat;

public class Bird implements CanFly {
    private String flyStyle;

    public Bird() {
    }

    public Bird(String flyStyle) {
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
        System.out.println("小鸟起飞方式："+flyStyle);

    }
}
