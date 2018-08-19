package com.fly.util;

import com.alibaba.fastjson.JSONObject;
import com.fly.pojo.vo.InputParam;

import java.util.Map;
import java.util.Properties;

/**
 * @author david
 */
public class Arr {

    public static String get(JSONObject jsonObject, String name) {
        String attr = jsonObject.getString(name);
        return attr == null ? "" : attr;
    }

    public static String get(JSONObject jsonObject, String name, String value) {
        String attr = jsonObject.getString(name);
        return attr == null || "".equals(attr.trim()) ? value : attr;
    }

    /**
     * 根据指定的key,从全局properties对象中获取value
     * @param p
     * @param key
     * @return
     */
    public static String getString(Properties p, String key) {
        return p.getProperty(key);
    }

    /**
     * 根据指定的key,从全局properties对象中获取value,并设置默认值
     * @param p
     * @param key
     * @param defaultValue
     * @return
     */
    public static String getString(Properties p, String key, String defaultValue) {
        return p.getProperty(key, defaultValue);
    }

    /**
     * 根据指定的key,从全局properties对象中获取value
     * @param p
     * @param key
     * @return
     */
    public static Integer getInteger(Properties p, String key) {
        return Integer.valueOf(p.getProperty(key));
    }

    /**
     * 根据指定的key,从全局properties对象中获取value,并设置默认值
     * @param p
     * @param key
     * @param defaultValue
     * @return
     */
    public static Integer getInteger(Properties p, String key, String defaultValue) {
        return Integer.valueOf(p.getProperty(key, defaultValue));
    }

    public static<T> T getString(InputParam inputParam, T t, String key) {
        Map map = (Map) inputParam.getBody();
        Object o = map.get(key);
        return (T) o;
    }

    public static String getString(InputParam inputParam, String key) {
        Map map = (Map) inputParam.getBody();
        return (String) map.get(key);
    }

    public static Integer getInteger(InputParam inputParam, String key) {
        Map map = (Map) inputParam.getBody();
        return (Integer) map.get(key);
    }

    public static Double getDouble(InputParam inputParam, String key) {
        Map map = (Map) inputParam.getBody();
        return (Double) map.get(key);
    }

    public static Long getLong(InputParam inputParam, String key) {
        Map map = (Map) inputParam.getBody();
        return (Long) map.get(key);
    }

//    public static<T> List<T> getString(InputParam inputParam, Class clazz) {
//        Object body = inputParam.getBody();
//
//    }

}
