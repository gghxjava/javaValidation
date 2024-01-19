package com.example.jakartaee;

import com.example.jakartaee.entity.User;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/hello-world")
public class HelloResource {
    @GET
    @Produces("text/plain")
    public String hello(@BeanParam User user) {
        return "Hello, World!";
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String helloUser(User user) {
        return "Hello, World!";
    }
}