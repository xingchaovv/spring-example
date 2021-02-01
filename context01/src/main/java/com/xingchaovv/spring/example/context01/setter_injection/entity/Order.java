package com.xingchaovv.spring.example.context01.setter_injection.entity;

import lombok.ToString;

@ToString
public class Order {

    private Product product;
    private User user;
    private String remark;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
