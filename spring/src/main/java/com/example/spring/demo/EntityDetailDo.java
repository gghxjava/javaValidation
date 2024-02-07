package com.example.spring.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntityDetailDo extends EntityDo{

    private OtherDo otherDo;

    private TwoOtherDo twoOtherDo;

}
