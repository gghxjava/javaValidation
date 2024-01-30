package com.example.entity;

import lombok.Getter;

@Getter
public class Data {

    private String one;
    private String two;

    public void setOne(String one) {
        this.one = one;
    }

    public void setTwo(String two) {
        this.two = two;
    }

    public Data(String one, String two) {
        this.one = one;
        this.two = two;
    }
}
