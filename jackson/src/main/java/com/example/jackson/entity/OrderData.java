package com.example.jackson.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderData {

    @JsonProperty(index = 2)
    private String one;
    @JsonProperty(index = 3)
    private String two;
    @JsonProperty(index = 1)
    private String three;

}
