package com.example.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Parent extends GrandParent implements Serializable {

    private String ap1;
    private String bp2;
    private String cp3;

}
