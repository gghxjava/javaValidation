package com.example.spring.demo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class EntityDetailV3Do extends EntityDetailDo{


    private List<EntitySkuDo> skuList;


    private List<EntityProcess> processList;
}
