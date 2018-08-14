package com.webshop.factory;

import com.webshop.plugin.JsonParserPlugin;
import com.webshop.plugin.RestPlugin;

public interface PluginFactory {
    JsonParserPlugin getJsonParserPlugin();
    RestPlugin getRestPlugin();
}
