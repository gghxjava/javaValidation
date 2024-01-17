package com.example.spring.controller;

import com.example.spring.entity.*;
import com.example.spring.enumData.UserTypeAdmin;
import org.springframework.http.HttpEntity;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping("/spring")
public class SpringController {

//    @PostMapping("${app.name.qxd}")
//    public String spZero(HttpEntity<String> sp) {
//        return "aaa";
//    }
    @Deprecated
    @PostMapping("/spOne")
    public String spOne(HttpEntity<String> sp) {
        return "aaa";
    }

    @PostMapping("/spTwo")
    public String spTwo(HttpEntity sp) {
        return "aaa";
    }

    @PostMapping("/spThree")
    public String spThree(RequestEntity<String> sp) {
        return "aaa";
    }

    @PostMapping("/spFour")
    public String spFour(RequestEntity sp) {
        return "aaa";
    }

    @PostMapping("/spFive")
    public String spFour(DeferredResult<String> sp) {
        return "aaa";
    }

    @PostMapping("/spSix")
    public String spSix(DeferredResult sp) {
        return "aaa";
    }

    @PostMapping("/spSeven")
    public String spSeven(MultipartFile sp) {
        return "aaa";
    }

    @PostMapping("/spEight")
    public String spEight(MFile sp) {
        return "aaa";
    }

    @PostMapping("/spTen")
    public String spTen(MyAppProperties sp) {
        return "aaa";
    }

    @PostMapping("/spEvel")
    public String spEvel(UserTypeAdmin sp) {
        return "aaa";
    }

    @PostMapping("/sp12")
    public String sp12(@RequestBody EnumTest sp) {
        int ordinal = UserTypeAdmin.ADMIN.ordinal();
        return "aaa";
    }

    @PostMapping("/sp13")
    public String sp13(@RequestBody Son sp) {
        int ordinal = UserTypeAdmin.ADMIN.ordinal();
        return "aaa";
    }

    @PostMapping("/sp14")
    public String sp14(O sp) {
        int ordinal = UserTypeAdmin.ADMIN.ordinal();
        return "aaa";
    }

}
