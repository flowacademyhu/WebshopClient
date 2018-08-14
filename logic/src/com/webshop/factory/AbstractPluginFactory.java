package com.webshop.factory;

import com.webshop.plugin.JsonParserPlugin;

public abstract class AbstractPluginFactory implements PluginFactory {
    private JsonParserPlugin jsonParserPlugin;

    @Override
    public JsonParserPlugin getJsonParserPlugin() {
        if (jsonParserPlugin == null) {
            jsonParserPlugin = createJsonParserPlugin();
        }
        return jsonParserPlugin;
    }

    protected abstract JsonParserPlugin createJsonParserPlugin();
}
