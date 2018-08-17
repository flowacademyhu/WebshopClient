package com.webshop;

import com.webshop.factory.GatewayFactory;
import com.webshop.factory.PluginFactory;
import com.webshop.interactor.SessionManager;

public abstract class AbstractLogic {
    // region Factory

    private PluginFactory pluginFactory;
    private GatewayFactory gatewayFactory;

    private GatewayFactory getGatewayFactory() {
        if (gatewayFactory == null) {
            gatewayFactory = createGatewayFactory();
        }
        return gatewayFactory;
    }

    protected abstract GatewayFactory createGatewayFactory();

    public PluginFactory getPluginFactory() {
        if (pluginFactory == null) {
            pluginFactory = createPluginFactory();
        }
        return pluginFactory;
    }

    protected abstract PluginFactory createPluginFactory();

    // endregion

    private SessionManager sessionManager;

    public SessionManager getSessionManager() {
        if (sessionManager == null) {
            sessionManager = new SessionManager(getGatewayFactory().getAuthenticationGateway());
        }
        return sessionManager;
    }
}
