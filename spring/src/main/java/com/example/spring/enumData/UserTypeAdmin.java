package com.example.spring.enumData;

public enum UserTypeAdmin {

    ADMIN(1,"管理员","地址1","name1"),

    MEMBER(2,"成员","地址2","name2"),

    GUEST(3,"GUEST","地址3","name3");

    private Integer code;
    private String desc;
    private String address;

    private String name;


    UserTypeAdmin(Integer code, String desc, String address,String name) {
        this.code = code;
        this.desc = desc;
        this.address = address;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public String getAddress() {
        return address;
    }

}
