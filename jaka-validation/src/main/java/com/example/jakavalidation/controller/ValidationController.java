package com.example.jakavalidation.controller;

import com.example.jakavalidation.annatation.BasicInfoGroup;
import com.example.jakavalidation.annatation.ExtendedInfoGroup;
import com.example.jakavalidation.entity.User;
import com.example.jakavalidation.entity.UserGroup;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/validation")
public class ValidationController {

    /**
     * @Valid 写了这个注解就等于开启了表单校验
     * @param user
     * @param bindingResult
     * @return
     */
    @PostMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("user") User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            // 如果有校验错误，返回表单页面
            return "userForm";
        }
        // 处理表单提交逻辑
        return "success";
    }

    @PostMapping("/processFormGroup")
    public String processFormGroup(@Validated({BasicInfoGroup.class, ExtendedInfoGroup.class}) @RequestBody UserGroup user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            // 如果有校验错误，返回表单页面
            return "userForm";
        }
        // 处理表单提交逻辑
        return "success";
    }

    @PostMapping("/processFormGroupThree")
    public String processFormGroupThree(@Validated({ExtendedInfoGroup.class}) @RequestBody UserGroup user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            // 如果有校验错误，返回表单页面
            return "userForm";
        }
        // 处理表单提交逻辑
        return "success";
    }

    @PostMapping("/processFormGroupFour")
    public String processFormGroupFour(@Validated(ExtendedInfoGroup.class) @RequestBody UserGroup user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            // 如果有校验错误，返回表单页面
            return "userForm";
        }
        // 处理表单提交逻辑
        return "success";
    }

    @PostMapping("/processFormGroupFive")
    public String processFormGroupFive(@Validated() @RequestBody UserGroup user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            // 如果有校验错误，返回表单页面
            return "userForm";
        }
        // 处理表单提交逻辑
        return "success";
    }

    @PostMapping("/processFormGroupSix")
    public String processFormGroupSix(@Validated({}) @RequestBody UserGroup user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            // 如果有校验错误，返回表单页面
            return "userForm";
        }
        // 处理表单提交逻辑
        return "success";
    }


    @PostMapping("/processFormGroupTwo")
    public String processFormGroupTwo(@Valid @RequestBody UserGroup user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            // 如果有校验错误，返回表单页面
            return "userForm";
        }
        // 处理表单提交逻辑
        return "success";
    }

    @PostMapping("/processFormGroupSeven")
    public String processFormGroupSeven(@Validated({}) @RequestBody List<UserGroup> users, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            // 如果有校验错误，返回表单页面
            return "userForm";
        }
        // 处理表单提交逻辑
        return "success";
    }

    @PostMapping("/processFormGroupEight")
    public String processFormGroupEight(@Valid @RequestBody List<UserGroup> users, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            // 如果有校验错误，返回表单页面
            return "userForm";
        }
        // 处理表单提交逻辑
        return "success";
    }

    @PostMapping("/processFormGroupNine")
    public String processFormGroupNine(@Valid @RequestBody List<UserGroup> users, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            // 如果有校验错误，返回表单页面
            return "userForm";
        }
        // 处理表单提交逻辑
        return "success";
    }

    @PostMapping("/processFormGroupTen")
    public String processFormGroupTen(@NotNull UserGroup a, String b) {
        // 处理表单提交逻辑
        return "success";
    }

    @PostMapping("/processFormGroup11")
    public String processFormGroup11(@Validated(BasicInfoGroup.class) @RequestBody UserGroup a, String b) {
        // 处理表单提交逻辑
        return "success";
    }







}
