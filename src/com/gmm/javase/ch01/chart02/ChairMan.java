package com.gmm.javase.ch01.chart02;

public class ChairMan extends Employee{
    private String traffic;

    public ChairMan() {
    }

    public ChairMan(String name, String addr, String salory, String traffic) {
        super(name, addr, salory);
        this.traffic = traffic;
    }

    public String getTraffic() {
        return traffic;
    }

    public void setTraffic(String traffic) {
        this.traffic = traffic;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("交通补助："+this.traffic);
    }
}
