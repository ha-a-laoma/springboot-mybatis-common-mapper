package com.ham.pojo;

import lombok.Data;

import java.util.Date;

public class Menu {
    private Integer id;
    private String food_name;
    private double price;
    private double discount;
    private Date create_time;
    private String create_user;
    private Date update_time;
    private String update_user;
    private Integer del_bind;

    public Menu() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getCreate_user() {
        return create_user;
    }

    public void setCreate_user(String create_user) {
        this.create_user = create_user;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public String getUpdate_user() {
        return update_user;
    }

    public void setUpdate_user(String update_user) {
        this.update_user = update_user;
    }

    public Integer getDel_bind() {
        return del_bind;
    }

    public void setDel_bind(Integer del_bind) {
        this.del_bind = del_bind;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", food_name='" + food_name + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", create_time=" + create_time +
                ", create_user='" + create_user + '\'' +
                ", update_time=" + update_time +
                ", update_user='" + update_user + '\'' +
                ", del_bind=" + del_bind +
                '}';
    }
}
