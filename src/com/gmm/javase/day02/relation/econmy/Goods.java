package com.gmm.javase.day02.relation.econmy;

public class Goods {
    //商品名称，价格，库存，详细信息
    private String goodsName;
    private double price;
    private int count;
    private String detail;

    public Goods() {
    }

    public Goods(String goodsName, double price, int count, String detail) {
        this.goodsName = goodsName;
        this.price = price;
        this.count = count;
        this.detail = detail;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
    public void show(){
        //显示商品的详情
        System.out.println("商品名称："+goodsName);
        System.out.println("商品价格："+price);
        System.out.println("商品库存："+count);
        System.out.println("商品详情："+detail);
    }
}
