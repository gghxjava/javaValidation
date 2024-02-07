package com.example.spring.demo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class EntityDetailMatrixDo extends EntityDetailV2Do{

    private List<OrderGoodsVo> orderGoodsVoList;
}
