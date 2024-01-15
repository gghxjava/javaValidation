package com.example.jackson.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({"firstName", "lastName", "age"})
public class User implements Serializable {

    @JsonProperty(value = "defaultName",defaultValue = "秦小东",required = true)
    private String name1;
    @JsonIgnore
    private String name2;
    @JsonFormat(pattern =  "yyyy-MM-dd")
    private String format;
    private String firstName;
    private String lastName;
    private String age;


    private String p1;
    protected String pu2;
    public String pu3;

    private  static String p4;
    private  static String p5;
    private  final String p6="a";
    private static final String p7="a";

}
