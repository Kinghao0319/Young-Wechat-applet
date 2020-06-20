package com.yhh.pojo;

public class User {
    private int id;
    private String wxid;
    private String name;
    private int gender;//0女1男
    private String email;
    private String city;

    public User(int id, String wxid, String name, int gender, String email, String city) {
        this.id = id;
        this.wxid = wxid;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.city = city;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWxid() {
        return wxid;
    }

    public void setWxid(String wxid) {
        this.wxid = wxid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", wxid='" + wxid + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
