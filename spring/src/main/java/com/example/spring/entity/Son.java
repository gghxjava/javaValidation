package com.example.spring.entity;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Son extends Parent implements Serializable {

    /**
     * @readOnly
     * @writeOnly
     */
    private String ason1;
    private String bson2;
    private String cson3;

    private List<O> cson4;

}
