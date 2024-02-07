package com.example.spring.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.spring.demo.EntityDetailV3Do;
import com.example.spring.entity.*;
import com.example.spring.entity.test.AccountApiTemplate;
import com.example.spring.entity.test.UserApiTemplate;
import com.example.spring.enumData.UserTypeAdmin;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.data.domain.Page;
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
public class SpringDemoController {
    @PostMapping(value = "/en")
    public EntityDetailV3Do sp27(String a) {
        return null;
    }

}
