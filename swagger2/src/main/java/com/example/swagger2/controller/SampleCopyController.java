package com.example.swagger2.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

/**
 * @author stackClass
 * @zz
 */
@RequestMapping("/api")
@Api(tags = "Sample API", description = "Operations for the Sample API")
public class SampleCopyController {

    /**
     * 名字
     * @author methodStack
     * @zz 123
     */
    @GetMapping("/hello")
    //@ApiOperation("Get a greeting message1")
    public String hello() {
        return "Hello, World!";
    }

    @PostMapping("/add")
    @ApiOperation("Add two numbers")
    public int add(
            @ApiParam(value = "First number", required = true) @RequestParam int a,
            @ApiParam(value = "Second number", required = true) @RequestParam int b) {
        return a + b;
    }

    @GetMapping("/square/{number}")
    @ApiOperation("Get the square of a number")
    public int square(
            @ApiParam(value = "Number to calculate square", required = true) @PathVariable int number) {
        return number * number;
    }

    @PutMapping("/update/{id}")
    @ApiOperation("Update an entity by ID")
    public String updateEntity(
            @ApiParam(value = "ID of the entity to update", required = true) @PathVariable Long id,
            @ApiParam(value = "Updated entity data", required = true) @RequestBody String updatedData) {
        // Your update logic here
        return "Entity updated successfully";
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation("Delete an entity by ID")
    public String deleteEntity(
            @ApiParam(value = "ID of the entity to delete", required = true) @PathVariable Long id) {
        // Your delete logic here
        return "Entity deleted successfully";
    }
}

