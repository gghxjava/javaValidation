package com.example.spring.demo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class OrderGoodsVo <T>{
    private ColorDo color;

    private List<SizeDo<T>> sizeList;
}
