package com.example.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class Son extends Parent{

    /**
     * @readOnly
     * @writeOnly
     */
    private String ason1;
    private String bson2;
    private String cson3;

    private List<O> cson4;

}
