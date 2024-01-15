package com.example.jackson.controller;

import com.example.jackson.entity.JsonOrder;
import com.example.jackson.entity.SerialData;
import com.example.jackson.entity.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

public class BaseController {

//    @PostMapping("/select")
//    public String select(@RequestBody User user) {
//        // 处理表单提交逻辑
//        return "success";
//    }

    public static void main(String[] args) throws Exception {
        // 创建 JsonOrder 对象
        JsonOrder jsonOrder = new JsonOrder();

        // 使用 ObjectMapper 进行序列化
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(jsonOrder);

        // 输出 JSON 字符串
        System.out.println(jsonString);
    }

}
