package com.example;

import com.example.entity.Data;
import com.example.service.GreetingService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/person")
public class ExampleResource {

    @Inject
    GreetingService service;

    @GET()
    @Path("/greeting/{name}/{age}")
    @Produces(MediaType.APPLICATION_XML)
    public String greetingGet(@PathParam("name") String name,@PathParam("age") String age) {
        return service.greeting(name);
    }

    @POST
    @Path("/greeting/{name}")
    public String greetingPost(@QueryParam("name1") String name,@QueryParam("name2")String age) {
        return service.greeting(name);
    }

    @POST
    @Path("/greeting/{name}")
    public String greetingPost1(@FormParam("name1") String name,@FormParam("name2")String age) {
        return service.greeting(name);
    }

    @GET
    @Path("/path/{id}")
    public Response getPathParamExample(@PathParam("id") int id) {
        return Response.ok("Path Parameter: " + id).build();
    }

    @GET
    @Path("/query")
    public Response getQueryParamExample(@QueryParam("name") String name) {
        return Response.ok("Query Parameter: " + name).build();
    }

    @GET
    @Path("/header")
    public Response getHeaderParamExample(@HeaderParam("Authorization") String authorization) {
        return Response.ok("Header Parameter (Authorization): " + authorization).build();
    }

    @GET
    @Path("/multiple/{param1}/{param2}")
    public Response getMultipleParamsExample(
            @PathParam("param1") String param1,
            @QueryParam("param2") String param2,
            @HeaderParam("Custom-Header") String customHeader) {

        return Response.ok("Path Parameter: " + param1 +
                ", Query Parameter: " + param2 +
                ", Custom Header: " + customHeader).build();
    }

    @GET
    @Path("/complex/{ida}")
    public Response getComplexParams(@BeanParam MyBean myBean) {
        return Response.ok("PathParam: " + myBean.getPathParam() +
                ", QueryParam: " + myBean.getQueryParam() +
                ", HeaderParam: " + myBean.getHeaderParam()).build();
    }

    public static class MyBean {

        private String serialVersionUID;

        @PathParam("ida")
        private String pathParam;

        @QueryParam("name")
        private String queryParam;

        @QueryParam("boolean")
        private Boolean aBoolean;

        @HeaderParam("Authorization")
        private String headerParam;

        /**
         * @ignore
         */
        private String ignore;


        private NestedBean nestedBean;
        // Getter and setter methods

        public String getPathParam() {
            return pathParam;
        }

        public void setPathParam(String pathParam) {
            this.pathParam = pathParam;
        }

        public String getQueryParam() {
            return queryParam;
        }

        public void setQueryParam(String queryParam) {
            this.queryParam = queryParam;
        }

        public String getHeaderParam() {
            return headerParam;
        }

        public void setHeaderParam(String headerParam) {
            this.headerParam = headerParam;
        }

        public NestedBean getNestedBean() {
            return nestedBean;
        }

        public void setNestedBean(NestedBean nestedBean) {
            this.nestedBean = nestedBean;
        }
    }

    public static class NestedBean {
        private String nestedParam;

        // Getter and setter methods for NestedBean

        public String getNestedParam() {
            return nestedParam;
        }

        public void setNestedParam(String nestedParam) {
            this.nestedParam = nestedParam;
        }
    }


}
