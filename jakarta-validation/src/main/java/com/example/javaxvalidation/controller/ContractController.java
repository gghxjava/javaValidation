package com.example.javaxvalidation.controller;

import com.example.javaxvalidation.annatation.ArgumentValidGroups;
import com.example.javaxvalidation.annatation.BasicInfoGroup;
import com.example.javaxvalidation.entity.UserGroup;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.xml.transform.Result;

@Validated
@RestController
@RequestMapping("/contract")
@Api(tags = "合同")
public class ContractController {

    @PostMapping("/prepareContract")
    @ApiOperation("编辑/保存/提交合同")
    public Result prepareContract(@RequestBody UserGroup po) {
        return null;
    }

    @PutMapping
    @ApiOperation("修改")
    public String update(@Validated(value = ArgumentValidGroups.editGroup.class) @RequestBody UserGroup dto) {
        return "";
    }

    @PostMapping("/changeContract")
    @ApiOperation("变更合同")
    public Result changeContract(@RequestBody UserGroup po) {
        return null;
    }



}
