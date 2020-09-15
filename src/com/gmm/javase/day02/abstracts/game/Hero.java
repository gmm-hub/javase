package com.gmm.javase.day02.abstracts.game;

public class Hero extends Role{

    private Equip[] equips = new Equip[3];
    private int index = 0;

    public Hero() {
    }

    public Hero(String name, String level, int blood, int power, int defence, String kind) {
        super(name, level, blood, power, defence, kind);
    }

    // 游戏角色拥有基本攻击方法（拥有一定几率打出暴击）attack(Monster m)  依赖关系
    public void attack(Role m){
        int random = (int)(Math.random()*10+1);
        int block =0;
        if (random>3){
            block += random*2;
        }
        int blood = this.getPower()+block-m.getDefence();
        if (blood>0){
            //产生有效攻击
            m.setBlood(m.getBlood()-blood);
            System.out.println("本次攻击产生"+blood+"点伤害"+"怪兽剩余血量"+m.getBlood());
        }
        else {
            System.out.println("此回合产生无效攻击！");
        }
    }

    //添加装备的方法
    public void addEquip(Equip e){
        if (index>=equips.length){
            System.out.println("装备已满");
            return;
        }
        equips[index++] = e;
        //把装备属性加到英雄身上
        this.setPower(this.getPower()+e.getPower());
        this.setDefence(this.getDefence()+e.getDefence());
    }

    // 获取英雄信息的方法show()
    public void show(){
        super.show();
        System.out.println("===============装备信息=================");
        for (int i=0;i<index;i++){
            equips[i].show();
            System.out.println("-------------------");
        }
    }
}
