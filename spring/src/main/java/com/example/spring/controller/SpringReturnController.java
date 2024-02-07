package com.example.spring.controller;

import com.example.spring.entity.Son;
import com.example.spring.entity.test.UserApiTemplate;
import org.apache.catalina.User;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

import java.io.*;

/**
 * @qxd
 */
@RequestMapping(value = "/springReturnController",produces = {MediaType.APPLICATION_OCTET_STREAM_VALUE})
public class SpringReturnController {

    @PostMapping(value = "/json")
    //@ResponseBody
    public Son one(@RequestBody Son sp) {
        return sp;
    }

    @PostMapping(value = "/two",produces = MediaType.APPLICATION_XML_VALUE)
    //@ResponseBody
    public Son two(@RequestBody Son sp) {
        return sp;
    }


    @PostMapping(value = "/three",produces = MediaType.IMAGE_GIF_VALUE)
    //@ResponseBody
    public Son three(@RequestBody Son sp) {
        return sp;
    }

}
