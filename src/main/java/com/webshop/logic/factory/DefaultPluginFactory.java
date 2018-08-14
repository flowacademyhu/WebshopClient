package com.webshop.logic.factory;

import com.webshop.factory.AbstractPluginFactory;
import com.webshop.logic.plugin.GsonJsonParserPlugin;
import com.webshop.plugin.JsonParserPlugin;
import com.webshop.plugin.RestPlugin;

public class DefaultPluginFactory extends AbstractPluginFactory {
    @Override
    protected JsonParserPlugin createJsonParserPlugin() {
        return new GsonJsonParserPlugin();
    }

    @Override
    protected RestPlugin createRestPlugin() {
        return null;
    }
}
