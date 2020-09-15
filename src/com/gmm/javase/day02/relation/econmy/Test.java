package com.gmm.javase.day02.relation.econmy;

public class Test {
    public static void main(String[] args) {
        //商品名称，价格，库存，详细信息
        Goods good1 = new Goods("百事可乐",3.50,50,"肥宅快乐水");
        Order order1 = new Order("Id001","20200915");
        User user1 = new User("张三",order1);
        user1.addOrder(good1);
        user1.show();
    }
}
