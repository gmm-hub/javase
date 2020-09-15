package com.gmm.javase.day02.relation.econmy;

public class User {
    private String userName;
    private Order order;

    public User() {
    }

    public User(String userName, Order order) {
        this.userName = userName;
        this.order = order;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void addOrder(Goods goods){
        this.order.addGoods(goods); //把商品添加到订单中
    }
    public void show(){
        System.out.println("顾客名称："+userName);
        this.order.show();
    }
}
