package com.gmm.javase.ch01.chart02;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("张三","淮北市","8000");
        employee.show();
        ChairMan chairMan = new ChairMan("李四","宿州市","9000","1000");
        chairMan.show();
        ManagerDemo managerDemo = new ManagerDemo("王五","亳州市","11000","运维部");
        managerDemo.show();
    }
}
