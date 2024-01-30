package com.example.usertest.controller;

import com.example.usertest.entity.SaleAccountVo;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.multipart.MultipartFile;

/**
 * 目录1/目录2
 */
@RestController
@RequestMapping("/userTest")
public class UserController {

    @GetMapping("/one")
    public String one(SaleAccountVo sp) {
        return "aaa";
    }


}
