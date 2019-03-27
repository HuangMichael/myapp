package com.huangbin.utils;


import java.io.IOException;
import java.io.StringWriter;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.log4j.Log4j2;


/**
 * json和对象互相转换工具类
 */
@Log4j2
public class JSONUtil {

    private static ObjectMapper mapper = new ObjectMapper();

    /**
     * @param obj
     * @return
     * @throws IOException
     */
    public static String BeanToJson(Object obj) throws IOException {
        StringWriter sw = new StringWriter();
        JsonGenerator gen = new JsonFactory().createGenerator(sw);
        mapper.writeValue(gen, obj);
        gen.close();
        return sw.toString();
    }


    /**
     * @param jsonStr
     * @param objClass
     * @param <T>
     * @return
     * @throws JsonParseException
     * @throws JsonMappingException
     * @throws IOException
     */
    public static <T> T JsonToBean(String jsonStr, Class<T> objClass) {

        T bean = null;
        try {
            bean = mapper.readValue(jsonStr, objClass);
        } catch (Exception e) {
            log.error("JSON转换对象错误");
            e.printStackTrace();
        }
        return bean;
    }

}