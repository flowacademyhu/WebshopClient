package com.webshop.factory;

import com.webshop.plugin.JsonParserPlugin;
import com.webshop.plugin.RestPlugin;

public abstract class AbstractPluginFactory implements PluginFactory {
    private JsonParserPlugin jsonParserPlugin;
    private RestPlugin restPlugin;

    @Override
    public JsonParserPlugin getJsonParserPlugin() {
        if (jsonParserPlugin == null) {
            jsonParserPlugin = createJsonParserPlugin();
        }
        return jsonParserPlugin;
    }

    protected abstract JsonParserPlugin createJsonParserPlugin();

    @Override
    public RestPlugin getRestPlugin() {
        if (restPlugin == null) {
            restPlugin = createRestPlugin();
        }
        return restPlugin;
    }

    protected abstract RestPlugin createRestPlugin();
}
