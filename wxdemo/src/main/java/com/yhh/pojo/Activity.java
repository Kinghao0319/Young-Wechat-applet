package com.yhh.pojo;

public class Activity {
    private int id;
    private String name;
    private String place;
    private String time;
    private int maxnum;
    private String description;
    private String imgpath;

    public Activity() {
    }

    public Activity(int id, String name, String place, String time, int maxnum, String description, String imgpath) {
        this.id = id;
        this.name = name;
        this.place = place;
        this.time = time;
        this.maxnum = maxnum;
        this.description = description;
        this.imgpath = imgpath;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getMaxnum() {
        return maxnum;
    }

    public void setMaxnum(int maxnum) {
        this.maxnum = maxnum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", time='" + time + '\'' +
                ", maxnum=" + maxnum +
                ", description='" + description + '\'' +
                ", imgpath='" + imgpath + '\'' +
                '}';
    }

}
