package com.webshop.logic.factory;

import com.webshop.factory.AbstractGatewayFactory;
import com.webshop.gateway.AuthenticationGateway;

public class DefaultGatewayFactory extends AbstractGatewayFactory {

    @Override
    protected AuthenticationGateway createAuthenticationGateway() {
        return null;
    }
}
