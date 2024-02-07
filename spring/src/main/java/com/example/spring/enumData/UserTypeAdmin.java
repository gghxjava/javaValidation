package com.example.spring.enumData;

import lombok.Getter;
@Getter
public enum UserTypeAdmin {

    /**
     * 固定描述1
     */
    ADMIN(1,"管理员","地址1","name1"),

    /**
     * 固定描述2
     */
    MEMBER(2,"成员","地址2","name2"),

    /**
     * 固定描述3
     */
    GUEST(3,"客人","地址3","name3");

    private final Integer code;
    private final String desc;
    private final String address;
    private final String name;

    UserTypeAdmin(Integer code, String desc, String address,String name) {
        this.code = code;
        this.desc = desc;
        this.address = address;
        this.name = name;
    }

}
