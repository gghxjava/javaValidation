package com.example.spring.entity;

import com.example.spring.enumData.UserTypeAdmin;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnumTest {

    /**
     * @see UserTypeAdmin
     */
    private String noEqualEnumPro;

    /**
     * @see UserTypeAdmin#code
     */
    private String noEqualEnumProButByCode;

    /**
     * @see UserTypeAdmin
     */
    private String code;

    /**
     * @see UserTypeAdmin
     */
    private String desc;

    /**
     * @see UserTypeAdmin#desc
     */
    private String noEqualEnumProButByDesc;

    /**
     * @see UserTypeAdmin
     */
    private String address;

    /**
     * @see UserTypeAdmin#address
     */
    private String noEqualEnumProButByAddress;

    /**
     * @see UserTypeAdmin
     */
    private String name;

    /**
     * @see UserTypeAdmin#name
     */
    private String noEqualEnumProButByName;

    /**
     * @see UserTypeAdmin
     */
    private UserTypeAdmin userTypeAdmin;

    /**
     * 自定义脚本规则实现 需要取消默认配置的枚举规则 不然会同时生效的
     */
    private UserTypeAdmin userTypeAdminSelf;

}
