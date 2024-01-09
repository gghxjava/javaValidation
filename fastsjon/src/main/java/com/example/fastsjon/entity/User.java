package com.example.fastsjon.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @JSONField(name = "namefast1")
    private String name1;

    @com.alibaba.fastjson2.annotation.JSONField(name = "namefast2")
    private String name2;

}
