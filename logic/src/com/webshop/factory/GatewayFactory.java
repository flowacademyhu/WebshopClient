package com.webshop.factory;

import com.webshop.gateway.AuthenticationGateway;

public interface GatewayFactory {
    AuthenticationGateway getAuthenticationGateway();
}
