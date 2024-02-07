package com.example.usertest.controller;

import com.example.usertest.entity.Adto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo/ctrl")
public class DemoController {

    /**
     * 总览11
     *
     * @author hbq
     * @date 2024/2/6 12:16
     */
    @PostMapping("/get")
    public Adto getOverview() {
        return null;
    }


}