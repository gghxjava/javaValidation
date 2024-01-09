package com.example.jackson.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({"firstName", "lastName", "age"})
public class User {

    @JsonProperty(value = "defaultName",defaultValue = "秦小东",required = true)
    private String name1;

    @JsonIgnore
    private String name2;

    @JsonFormat(pattern =  "yyyy-MM-dd")
    private String format;


    private String firstName;
    private String lastName;
    private String age;

}
