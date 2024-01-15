package com.example.jackson.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestJsonFieldBean {

    @JsonProperty(value = "a", index = 99)
    private Long propertyA;

    private Long propertyB;

    @JsonProperty(value = "c", index = 0)
    private Long propertyC;

    @JsonProperty(value = "d", index = 11)
    private Long propertyD;

}

