package com.yhh.pojo;

public class Official {
    private int id;
    private String name;
    private String description;
    private String icon;
    private int hotnum;

    public Official() {
    }

    public Official(int id, String name, String description, String icon, int hotnum) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.icon = icon;
        this.hotnum = hotnum;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getHotnum() {
        return hotnum;
    }

    public void setHotnum(int hotnum) {
        this.hotnum = hotnum;
    }

    @Override
    public String toString() {
        return "Official{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", icon='" + icon + '\'' +
                ", hotnum=" + hotnum +
                '}';
    }
}

