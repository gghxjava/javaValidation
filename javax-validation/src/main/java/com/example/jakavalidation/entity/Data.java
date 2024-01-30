package com.example.jakavalidation.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
public class Data {

    private String one;
    private Integer two;
    private Data three;
    private Data2 four;

    //private Person person;

    private Map<String,Data> aa;
    private Map<String,Data> bb;

    private List<Data> cc;

}
