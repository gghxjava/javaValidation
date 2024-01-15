package com.example.spring.enumData;

public enum UserTypeAdmin {

    /**
     * aaa
     */
    ADMIN(1,"管理员","地址1"),

    MEMBER(2,"成员","地址2"),

    GUEST(3,"GUEST","地址3");

    private Integer code;
    private String desc;
    private String address;


    UserTypeAdmin(Integer code, String desc, String address) {
        this.code = code;
        this.desc = desc;
        this.address = address;
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
