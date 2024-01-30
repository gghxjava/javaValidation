package com.example.jakavalidation.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
public class Data2 {

    private Integer five;
    private String six;

    private Data seven;
    private Data2 eight;

    private String one;
}
