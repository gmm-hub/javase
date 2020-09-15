package com.gmm.javase.day02.abstracts.game;

public class Monster extends Role{

    @Override
    public void attack(Role h){
        int blood = 0;//英雄失血量
        blood = this.getPower()-h.getDefence();
        if (blood>0){
            //产生有效攻击
            h.setBlood(h.getBlood()-blood);
            System.out.println("本次攻击产生"+blood+"点伤害"+"英雄剩余血量"+h.getBlood());
        }else{
            System.out.println("此回合产生无效攻击！");

        }
    }

    public Monster() {
    }

    public Monster(String name, String level, int blood, int power, int defence, String kind) {
        super(name, level, blood, power, defence, kind);
    }
}
