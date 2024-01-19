package com.example.spring.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.spring.entity.*;
import com.example.spring.enumData.UserTypeAdmin;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.http.HttpEntity;
import org.springframework.http.RequestEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.multipart.MultipartFile;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/spring")
public class SpringController {

//    @PostMapping("${app.name.qxd}")
//    public String spZero(HttpEntity<String> sp) {
//        return "aaa";
//    }


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


    @PostMapping("/processFormGroup14")
    public PagedListHolder<Parent> sp15(PagedListHolder<Son> tesTT, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            // 如果有校验错误，返回表单页面
            return null;
        }
        // 处理表单提交逻辑
        return null;
    }

    @PostMapping("/sp16")
    public String sp16(@RequestBody  Person<Son> sp) {
        int ordinal = UserTypeAdmin.ADMIN.ordinal();
        return null;
    }

    @PostMapping("/sp18")
    public R<IPage<Son>> sp18(IPage<Son> sp) {
        int ordinal = UserTypeAdmin.ADMIN.ordinal();
        return null;
    }

    @PostMapping("/sp19")
    public R<IPage> sp19(IPage sp) {
        int ordinal = UserTypeAdmin.ADMIN.ordinal();
        return null;
    }

    @Deprecated
    @PostMapping("/spOne")
    public String spOne(HttpEntity<Son> sp) {
        return "aaa";
    }

//    @PostMapping("/sp17")
//    public R<Son> sp17(@RequestBody Flux<Son> sp) {
//        int ordinal = UserTypeAdmin.ADMIN.ordinal();
//        return null;
//    }

}
