package com.gmm.javase.day02.relation.game;

public class Hero {
    private String name;
    private String level;
    private int blood;
    private int power;
    private String kind;
    private int defence;

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    private Equip[] equips = new Equip[3];
    private int index = 0;

    public Hero() {
    }

    public Hero(String name, String level, int blood, int power, String kind, int defence) {
        this.name = name;
        this.level = level;
        this.blood = blood;
        this.power = power;
        this.kind = kind;
        this.defence = defence;
    }

    public Hero(String name, String level, int blood, int power, String kind, Equip[] equips) {
        this.name = name;
        this.level = level;
        this.blood = blood;
        this.power = power;
        this.kind = kind;
        this.equips = equips;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Equip[] getEquips() {
        return equips;
    }

    public void setEquips(Equip[] equips) {
        this.equips = equips;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    // 游戏角色拥有基本攻击方法（拥有一定几率打出暴击）attack(Monster m)  依赖关系
    public void attack(Monster m){
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
    // 死亡判定方法isDead()
    public boolean isDead(){
        if(this.blood<=0){
            //game over
            return false;
        }
        return true;
    }
    //添加装备的方法
    public void addEquip(Equip e){
        if (index>=equips.length){
            System.out.println("装备已满");
            return;
        }
        equips[index++] = e;
        //把装备属性加到英雄身上
        this.power += e.getPower();
        this.defence += e.getDefence();
    }

    // 获取英雄信息的方法show()
    public void show(){
        //英雄拥有名称name，等级level，血量blood，攻击力power，防御力defence，种族kind
        System.out.println("英雄名称："+name);
        System.out.println("英雄级别："+level);
        System.out.println("英雄血量："+blood);
        System.out.println("英雄攻击力："+power);
        System.out.println("英雄防御力："+defence);
        System.out.println("英雄类别："+kind);

        System.out.println("===============装备信息=================");
        for (int i=0;i<index;i++){
            equips[i].show();
            System.out.println("-------------------");
        }
    }
}
