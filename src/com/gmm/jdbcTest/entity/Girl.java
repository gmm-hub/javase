package com.gmm.jdbcTest.entity;

import java.sql.Timestamp;

public class Girl {
    private Integer id;
    private String name;
    private String sex;
    private Timestamp borndate;
    private String phone;
    private String photo;
    private Integer boyfriend_id;

    public Girl() {
    }

    public Girl(String name, String sex, Timestamp borndate, String phone, Integer boyfriend_id) {
        this.name = name;
        this.sex = sex;
        this.borndate = borndate;
        this.phone = phone;
        this.boyfriend_id = boyfriend_id;
    }

    public Girl(Integer id, String name, String sex, Timestamp borndate, String phone, String photo, Integer boyfriend_id) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.borndate = borndate;
        this.phone = phone;
        this.photo = photo;
        this.boyfriend_id = boyfriend_id;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Timestamp getBorndate() {
        return borndate;
    }

    public void setBorndate(Timestamp borndate) {
        this.borndate = borndate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Integer getBoyfriend_id() {
        return boyfriend_id;
    }

    public void setBoyfriend_id(Integer boyfriend_id) {
        this.boyfriend_id = boyfriend_id;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", borndate=" + borndate +
                ", phone='" + phone + '\'' +
                ", photo='" + photo + '\'' +
                ", boyfriend_id=" + boyfriend_id +
                '}';
    }
}
