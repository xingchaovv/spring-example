package com.xingchaovv.spring.example.modules.dependencylookup.domain;

public class User {

    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return String.format("HashCode: %s, Id: %d, name: %s", hashCode(), getId(), getName());
    }
}
