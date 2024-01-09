package com.example.jackson.controller;


import com.example.jackson.entity.JsonIgnore;
import com.example.jackson.entity.OrderData;
import com.example.jackson.entity.User;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fastjson")
public class FastController {

    @PostMapping("/name")
    public String processFormGroupSeven(@RequestBody User user) {

        // 处理表单提交逻辑
        return "success";
    }


    @PostMapping("/name")
    public String processFormGroup(@RequestBody JsonIgnore orderData) {
        // 处理表单提交逻辑
        return "success";
    }



}
