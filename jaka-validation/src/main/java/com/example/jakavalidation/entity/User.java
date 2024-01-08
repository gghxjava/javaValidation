package com.example.jakavalidation.entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @NotNull(message = "用户名不能为空")
    @Size(min = 5, max = 20, message = "用户名长度必须在5到20之间")
    private String username;

    @NotNull(message = "密码不能为空")
    @Size(min = 8, message = "密码长度至少为8")
    private String password;

    @Email(message = "邮箱格式不正确")
    private String email;


}
