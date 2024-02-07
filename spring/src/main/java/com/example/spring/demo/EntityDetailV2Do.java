package com.example.spring.demo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EntityDetailV2Do extends EntityDetailDo{

    private EntityDo otherEntity;

    private EntityDo oneEntity;

    private EntityDo twoEntity;
}
