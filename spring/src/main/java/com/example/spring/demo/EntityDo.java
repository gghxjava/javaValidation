package com.example.spring.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntityDo extends BaseDo{

    private Long deptId;

    private Long topDeptId;

    private Integer status;

    private Integer makeClothesStatus;

    private Integer makeClothesCraftStatus;
}
