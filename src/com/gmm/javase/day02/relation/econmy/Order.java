package com.gmm.javase.day02.relation.econmy;



public class Order {
    //订单编号，下单日期，订单金额，商品种类数量
    private String orderId;
    private String date;
    private double total=0.0;
    private Goods[] goods = new Goods[5];
    private int index = 0;

    public Order() {
    }
    public Order(String orderId, String date) {
        this.orderId = orderId;
        this.date = date;
    }

    public Order(String orderId, String date, Goods[] goods) {
        this.orderId = orderId;
        this.date = date;
        this.goods = goods;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Goods[] getGoods() {
        return goods;
    }

    public void setGoods(Goods[] goods) {
        this.goods = goods;
    }
    public void addGoods(Goods g){
        if (index>=goods.length){
            System.out.println("商品种类超过订单容量！不能继续添加，请先结账!");
        }
        this.goods[index++] = g;
        this.total += g.getCount()*g.getPrice();
    }
    public void show(){
        System.out.println("订单编号："+orderId);
        System.out.println("订单日期："+date);
        System.out.println("订单总价："+total);
        System.out.println("===============商品详情================");
        for (int i=0;i<index;i++){
            goods[i].show();
            System.out.println("---------------------");
        }
    }
}
