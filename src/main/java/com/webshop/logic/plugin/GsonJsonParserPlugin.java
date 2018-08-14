package com.webshop.logic.plugin;

import com.webshop.plugin.JsonParserPlugin;

public class GsonJsonParserPlugin implements JsonParserPlugin {
    @Override
    public String toJson(Object object) {
        return null;
    }

    @Override
    public <T> T parse(String json, Class<T> cls) {
        return null;
    }
}
