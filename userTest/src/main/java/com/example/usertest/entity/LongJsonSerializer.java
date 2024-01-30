package com.example.usertest.entity;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;

public class LongJsonSerializer extends JsonSerializer<Long> {
    public LongJsonSerializer() {
    }

    public void serialize(Long value, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
        String text = value == null ? null : String.valueOf(value);
        if (text != null) {
            jsonGenerator.writeString(text);
        }

    }
}

