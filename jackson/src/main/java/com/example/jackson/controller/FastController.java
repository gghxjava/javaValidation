package com.example.jackson.controller;


import com.example.jackson.entity.*;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fastjson")
public class FastController extends BaseController{

//    @PostMapping("/name")
//    public String processFormGroupSeven(@RequestBody User user) {
//        // 处理表单提交逻辑
//        return "success";
//    }
//
//    @PostMapping("/name")
//    public String processFormGroup(@RequestBody JsonIgnore orderData) {
//        // 处理表单提交逻辑
//        return "success";
//    }
//
    @PostMapping("/processFormOrder")
    public String processFormOrder(@RequestBody TestJsonFieldBean orderData) {
        // 处理表单提交逻辑
        return "success";
    }

    @GetMapping("/select")
    public String select(@RequestBody SerialData user) {
        // 处理表单提交逻辑
        return "success";
    }

    @GetMapping("/selectOrder")
    public String selectOrder(@RequestBody JsonOrder user) {
        // 处理表单提交逻辑
        return "success";
    }

    @GetMapping("/toString")
    public String toString(@RequestBody SerialData user) {
        // 处理表单提交逻辑
        return "success";
    }
}
