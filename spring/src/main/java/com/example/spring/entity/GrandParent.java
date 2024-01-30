package com.example.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GrandParent extends Person<O> implements Serializable {

    private String az1;
    private String bz2;
    private String cz3;


}
