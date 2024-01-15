package com.example.jackson.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SerialData implements Serializable {

    // 自动生成的 serialVersionUID 示例
    private static final long serialVersionUID = 1L; // 版本 1
    /**
     * @order 100
     */
    private String p1;
    /**
     * @order 101
     */
    protected String pu2;
    /**
     * @order 99
     */
    public String pu3;

    /**
     * @order 102
     */
    public String kotlin1;
    private  static String p4;
    private  static String p5;
    private  final String p6="a";
    private static final String p7="a";

    private transient String t1;

}
