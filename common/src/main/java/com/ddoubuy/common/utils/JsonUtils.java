package com.ddoubuy.common.utils;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @description: JSON工具类
 * @author: boykaff
 * @date: 2022-04-14-0014
 */
@Component
@Slf4j
public class JsonUtils {
    @Autowired
    private ObjectMapper springObjectMapper;
    private static ObjectMapper objectMapper;

    @PostConstruct
    public void init() {
        objectMapper = springObjectMapper;
    }

    static {
        if (null == objectMapper) {
            objectMapper = new ObjectMapper();
        }
    }


    public static <T> T parseObject(String json, Class<T> tClass) {
        try {
            return objectMapper.readValue(json, tClass);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJsonString(Object object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> List<T> parseList(String json, Class<T> tClass) {
        JavaType javaType = objectMapper.getTypeFactory().constructParametricType(List.class, tClass);
        try {
            List<T> list = objectMapper.readValue(json, javaType);
            return list;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String data = "{}";
        parseObject(data, Map.class);
    }
}
