package com.example.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("myapp")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyAppProperties {

    private String property1="qxd";
    private int property2=22;

}
