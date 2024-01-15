package com.example.jackson.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsonOrder {

    private String one6;
    @JsonProperty(index = 20)
    private String one1;
    @JsonProperty(index = 10)
    private String one2;
    @JsonProperty(index = 60)
    private String one3;
    @JsonProperty(index = 70)
    private String one4;
    @JsonProperty(index = 30)
    private String one5;


}
