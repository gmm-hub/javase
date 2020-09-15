package com.gmm.javase.day02.abstracts.game;

public class Test {
    public static void main(String[] args) {
        Equip e1 = new Equip("无尽之刃","8","金黄色","宝剑",120,50);
        Equip e2 = new Equip("暴风大件","8","白色","宝刀",100,90);
        Equip e3 = new Equip("短刀","3","银色","小刀",60,60);
//      public Hero(String name, String level, int blood, int power, String kind, int defence)

        Hero hero = new Hero("剑圣","8",600,100,60,"兽类");
        Monster monster = new Monster("远古巨龙","8",600,160,80,"怪兽");
        //给英雄添加装备
        hero.addEquip(e1);
        //显示英雄怪兽属性
        hero.show();
        monster.show();
        int count =0;

        while (true){
            count++;
            System.out.println("==========这是第"+count+"回合===============");
            //英雄先发起攻击
            hero.attack(monster);
            //判断怪兽是否死亡
            if(!monster.isDead()){
                System.exit(0);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //怪兽发起攻击
            monster.attack(hero);
            if(!hero.isDead()){
                System.exit(0);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
