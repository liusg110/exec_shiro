package com.xiaoyao.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xiaoyao.scan.JacksonObjectMapper;
import java.io.IOException;

/**
 * JsonUtils 工具类，静态内部类创建唯一的JacksonObjectMapper，懒加载
 */
public final class JsonUtils {
    private JsonUtils() {}

    /**
     * @Description: 将对序列化成json字符串
     * @author: lsg
     * @date:  2017/12/16
     */
    public static String toJson(Object object) {

        try {
            return getInstance().writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @methodName: parse
     * @Description: 将json反序列化成对象
     * @author: lsg
     * @date:  2017/12/16
     */
    public static <T> T parse(String jsonString, Class<T> valueType) {

        try {
            return getInstance().readValue(jsonString, valueType);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static ObjectMapper getInstance() {
        return JacksonHolder.INSTANCE;
    }

    private static class JacksonHolder {
        private static ObjectMapper INSTANCE = new JacksonObjectMapper();
    }

}
