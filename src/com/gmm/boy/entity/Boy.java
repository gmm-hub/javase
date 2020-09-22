package com.gmm.boy.entity;

public class Boy {

    private Integer id;
    private String name;

    public Boy() {
    }

    public Boy(String name) {
        this.name = name;
    }

    public Boy(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Boy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
