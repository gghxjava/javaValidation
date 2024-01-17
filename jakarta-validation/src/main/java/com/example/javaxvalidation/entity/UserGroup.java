package com.example.javaxvalidation.entity;

import com.example.javaxvalidation.annatation.BasicInfoGroup;

import com.example.javaxvalidation.annatation.ExtendedInfoGroup;
import com.example.javaxvalidation.annatation.OneGroup;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import jakarta.validation.groups.Default;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.validation.annotation.Validated;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Valid
public class UserGroup {

    @NotNull(message = "用户名不能为空",groups = {BasicInfoGroup.class, ExtendedInfoGroup.class})
    private String username;

    @NotNull(message = "用户名不能为空",groups = {BasicInfoGroup.class})
    private String username1;

    @NotNull(message = "用户名不能为空",groups = {ExtendedInfoGroup.class})
    private String username2;

    @NotNull(message = "用户名不能为空",groups = {BasicInfoGroup.class, OneGroup.class})
    private String username3;

    @NotNull(message = "用户名不能为空",groups = { OneGroup.class})
    private String username4;

    @NotNull(message = "密码不能为空")
    private String password;

    @NotNull
    @Email(message = "邮箱格式不正确",groups = BasicInfoGroup.class)
    private String email;


    @Email(message = "邮箱格式不正确",groups = Default.class)
    private String email2;

    @Valid
    private Address address;


    @AssertTrue(groups = BasicInfoGroup.class)
    private Boolean accessTrue;

    @AssertFalse
    private Boolean accessFalse;

    @DecimalMax(value = "100",groups = BasicInfoGroup.class)
    @DecimalMin(value = "10",groups = BasicInfoGroup.class)
    private Integer intMax;

    @DecimalMax(value = "100.1",groups = BasicInfoGroup.class)
    @DecimalMin(value = "10.1",groups = BasicInfoGroup.class)
    private Integer intMaxF;

    @DecimalMax(value = "100.1",groups = BasicInfoGroup.class)
    private String intMaxF1;


    @DecimalMin(value = "10.1",groups = BasicInfoGroup.class)
    private String intMaxF2;

    @Digits(integer = 3, fraction = 2)
    private Double aDouble1;

    @Digits(integer = 3, fraction = 2,groups = BasicInfoGroup.class)
    private Double aDouble2;

    @Min(value = 100,groups = BasicInfoGroup.class)
    @Max(value = 200,groups = BasicInfoGroup.class)
    private Double min1;

    @Min(value = 100)
    @Max(value = 200)
    private Double min2;

    @Min(value = 100,groups = BasicInfoGroup.class)
    private Double min3;

    @Min(value = 100)
    private Double min4;

    @Max(value = 200,groups = BasicInfoGroup.class)
    private Double min5;

    @Max(value = 200)
    private Double min6;

    @Negative(groups = BasicInfoGroup.class)
    private Double negative1;

    @Negative
    private Double negative2;

    @NegativeOrZero(groups = BasicInfoGroup.class)
    private Double negative3;

    @NegativeOrZero
    private Double negative4;

    // 验证字符串是否符合邮政编码的格式，即6位数字
    @Pattern(regexp = "\\d{6}")
    private String postalCode1;

    // 验证字符串是否符合邮政编码的格式，即6位数字
    @Pattern(regexp = "\\d{6}",groups = BasicInfoGroup.class)
    private String postalCode2;

    @Positive(groups = BasicInfoGroup.class)
    private Double positive1;

    @Positive
    private Double positive2;

    @PositiveOrZero(groups = BasicInfoGroup.class)
    private Double positive3;

    @PositiveOrZero
    private Double positive4;

    @Size(min = 1,max = 5,groups = BasicInfoGroup.class)
    private String size1;
    @Size(min = 1,max = 5)
    private String size2;


    @Length(min = 1,max = 6,groups = BasicInfoGroup.class)
    private String length1;

    @Length(min = 1,max = 6)
    private String length2;

    @Range(min = 1,max = 6,groups = BasicInfoGroup.class)
    private String range1;

    @Range(min = 1,max = 6)
    private String range2;


}
