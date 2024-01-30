package com.example.spring.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;

@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
public class DataTest {

    private String one;
    private String two;
    private DataTest three;

    private static final String A = "秦小东1";
    private static final String B = "秦小东2";
    private static final String C = "秦小东3";

}
