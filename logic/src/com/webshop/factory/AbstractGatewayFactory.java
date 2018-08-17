package com.webshop.factory;

import com.webshop.gateway.AuthenticationGateway;

public abstract class AbstractGatewayFactory implements GatewayFactory {
    private AuthenticationGateway authenticationGateway;

    @Override
    public AuthenticationGateway getAuthenticationGateway() {
        if (authenticationGateway == null) {
            authenticationGateway = createAuthenticationGateway();
        }
        return authenticationGateway;
    }

    protected abstract AuthenticationGateway createAuthenticationGateway();

}
