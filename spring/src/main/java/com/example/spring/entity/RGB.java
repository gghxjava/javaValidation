package com.example.spring.entity;

public enum RGB {

    RED("红色",1);

    RGB(String name, Integer index) {
        this.name = name;
        this.index = index;
    }

    private String name;
    private Integer index;



}
