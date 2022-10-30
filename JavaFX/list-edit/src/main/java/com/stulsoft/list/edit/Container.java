package com.stulsoft.list.edit;

public class Container {
    private String name;

    public Container(){}

    public Container(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Container{" +
                "name='" + name + '\'' +
                '}';
    }
}
