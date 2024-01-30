package com.example.usertest.entity;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

public class LongJsonDeserializer extends JsonDeserializer<Long> {
    private static final Logger logger = LoggerFactory.getLogger(LongJsonDeserializer.class);

    public LongJsonDeserializer() {
    }

    public Long deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        String value = jsonParser.getText();
        if (value == null) {
            return null;
        } else {
            try {
                return StringUtils.isEmpty(value) ? null : Long.parseLong(value);
            } catch (NumberFormatException var5) {
                logger.error("解析长整形错误", var5);
                return null;
            }
        }
    }
}
