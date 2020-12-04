package com.xingchaovv.spring.example.modules.dependency.domain;

import com.xingchaovv.spring.example.modules.dependency.annotation.Super;

/**
 * 超级用户
 */
@Super
public class SuperUser extends User {

    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("SuperUser, HashCode: %s, Id: %d, name: %s, address: %s", hashCode(), getId(), getName(), getAddress());
    }
}
