package com.example.fastsjon.controller;


import com.example.fastsjon.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fastjson")
public class FastController {

    @PostMapping("/name")
    public String processFormGroupSeven(User user) {

        // 处理表单提交逻辑
        return "success";
    }

}
