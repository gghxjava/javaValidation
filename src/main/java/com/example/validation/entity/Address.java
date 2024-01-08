package com.example.validation.entity;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    //@NotNull(message = "普通地址不能为空")
    private String address;
    //@NotNull(message = "详细地址不能为空")
    private String addressDesc;
    //@NotNull(message = "简略地址不能为空")
    private String addressSimple;

}
