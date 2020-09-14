package com.gmm.javase.ch01.chart02;

public class ManagerDemo extends Employee {
    private String department;

    public ManagerDemo(String name, String addr, String salory, String department) {
        super(name, addr, salory);
        this.department = department;
    }

    public ManagerDemo() {
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("所管部部门："+this.department);
    }
}
