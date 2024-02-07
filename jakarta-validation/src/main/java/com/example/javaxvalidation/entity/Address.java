package com.example.javaxvalidation.entity;

import com.example.javaxvalidation.annatation.BasicInfoGroup;
import com.example.javaxvalidation.annatation.ExtendedInfoGroup;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @NotNull(message = "普通地址不能为空",groups = {BasicInfoGroup.class})
    private String address;
    @NotNull(message = "详细地址不能为空",groups = {ExtendedInfoGroup.class})
    private String addressDesc;
    @NotNull(message = "简略地址不能为空")
    private String addressSimple;


}


