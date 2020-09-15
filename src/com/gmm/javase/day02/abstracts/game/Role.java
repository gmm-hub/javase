package com.gmm.javase.day02.abstracts.game;

public abstract class  Role {
    //怪兽拥有名称name，等级level，血量blood，攻击力power，防御力defence，种族kind。
    private String name;
    private String level;
    private int blood;
    private int power;
    private int defence;
    private String kind;

    public Role() {
    }

    public Role(String name, String level, int blood, int power, int defence, String kind) {
        this.name = name;
        this.level = level;
        this.blood = blood;
        this.power = power;
        this.defence = defence;
        this.kind = kind;
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

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
    //怪兽的基本攻击方法
    public abstract void attack(Role h);
    //死亡判定方法
    public boolean isDead(){
        if(this.blood<=0){
            return false;
        }
        return true;
    }
    //获取怪兽信息方法
    public void show(){
        //角色拥有名称name，等级level，血量blood，攻击力power，防御力defence，种族kind
        System.out.println("怪兽名称："+name);
        System.out.println("怪兽级别："+level);
        System.out.println("怪兽血量："+blood);
        System.out.println("怪兽攻击力："+power);
        System.out.println("怪兽防御力："+defence);
        System.out.println("怪兽类别："+kind);
    }
}
