package com.webshop.logic;

import com.webshop.AbstractLogic;
import com.webshop.factory.GatewayFactory;
import com.webshop.factory.PluginFactory;
import com.webshop.logic.factory.DefaultGatewayFactory;
import com.webshop.logic.factory.DefaultPluginFactory;

public class Logic extends AbstractLogic {

    @Override
    protected GatewayFactory createGatewayFactory() {
        return new DefaultGatewayFactory();
    }

    @Override
    protected PluginFactory createPluginFactory() {
        return new DefaultPluginFactory();
    }
}
