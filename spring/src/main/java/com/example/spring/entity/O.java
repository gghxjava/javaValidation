package com.example.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class O {
    /**
     * @order 3
     */
    private String a;
    /**
     * @order 7
     */
    private String b;

    /**
     * @order 1
     */
    private String c;
}
