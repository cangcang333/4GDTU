package com.spzhu.entity;

public class UserEntity extends PageEntity{

    String id;

    String name;

    @Override
    public String toString() {
        return "id = " + id + ", name = " + name + "\n";

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
