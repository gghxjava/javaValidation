package com.example.spring.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.spring.entity.*;
import com.example.spring.enumData.UserTypeAdmin;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.http.HttpEntity;
import org.springframework.http.RequestEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping("/spring")
public class SpringNoApiController {

    @PostMapping()
    public String spZero0(HttpEntity<String> sp) {
        return "aaa";
    }

    @DeleteMapping()
    public String spZero1(HttpEntity<String> sp) {
        return "aaa";
    }



}
