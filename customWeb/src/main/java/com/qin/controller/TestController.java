package com.qin.controller;

import com.qin.anno.Con;
import com.qin.anno.Path;

import java.util.ArrayList;

@Con
@Path("/qxd")
public class TestController {

    /**
     * @path test
     */
    @Path("/qxd")
    private String name(String name){
        return "aa";
    }

}
