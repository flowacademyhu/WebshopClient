package com.webshop.logic.plugin;

import com.google.gson.Gson;
import com.webshop.plugin.JsonParserPlugin;

public class GsonJsonParserPlugin implements JsonParserPlugin {
    private static final Gson GSON = new Gson();

    @Override
    public String toJson(Object object) {
        return GSON.toJson(object);
    }

    @Override
    public <T> T parse(String json, Class<T> cls) {
        return GSON.fromJson(json, cls);
    }
}
