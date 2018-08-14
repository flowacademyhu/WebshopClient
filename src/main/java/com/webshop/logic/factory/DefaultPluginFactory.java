package com.webshop.logic.factory;

import com.webshop.factory.AbstractPluginFactory;
import com.webshop.plugin.JsonParserPlugin;

public class DefaultPluginFactory extends AbstractPluginFactory {
    @Override
    protected JsonParserPlugin createJsonParserPlugin() {
        return null;
    }
}
