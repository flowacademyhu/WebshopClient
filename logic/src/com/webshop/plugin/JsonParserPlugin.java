package com.webshop.plugin;

public interface JsonParserPlugin {
    String toJson(Object object);
    <T> T parse(String json, Class<T> cls);
}
