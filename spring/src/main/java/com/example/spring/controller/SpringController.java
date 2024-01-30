package com.example.spring.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.spring.entity.*;
import com.example.spring.entity.test.AccountApiTemplate;
import com.example.spring.entity.test.UserApiTemplate;
import com.example.spring.entity.test.UserRequestParam;
import com.example.spring.enumData.UserTypeAdmin;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.multipart.MultipartFile;
import reactor.core.publisher.Flux;

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
    public String spTen(@RequestBody MyAppProperties sp) {
        return "aaa";
    }

    @PostMapping("/spEvel")
    public String spEvel(UserTypeAdmin sp) {
        return "aaa";
    }

    /**
     * @author APS-CFyG2vZkpHoZwr5yuuR8f23LNvinr0G4
     * @param sp
     * @return
     */
    @PostMapping("/sp12")
    public String sp12(@RequestBody EnumTest sp,@PathVariable("name")String name) {
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
    public R<IPage<Son>> sp18(String sp) {
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

    @PostMapping("/sp17")
    public R<Son> sp17(@RequestBody Flux<Son> sp) {
        int ordinal = UserTypeAdmin.ADMIN.ordinal();
        return null;
    }

    @PostMapping("/sp20")
    public String sp20(@RequestBody AccountApiTemplate sp) {
        return "aaa";
    }

    @PostMapping(value = "/sp21", produces = MediaType.TEXT_PLAIN_VALUE)
    public String sp21(@RequestBody UserApiTemplate sp) {
        return "aaa";
    }

    @PostMapping(value = "/sp22")
    public String sp22(@RequestBody DataTest sp) {
        return "aaa";
    }

    @PostMapping(value = "/sp23")
    public R<Page<Son>> sp23(@RequestBody DataTest sp) {
        return null;
    }

    @PostMapping(value = "/sp24/{aa}")
    public R<Page<Son>> sp24(String a) {
        return null;
    }

}
