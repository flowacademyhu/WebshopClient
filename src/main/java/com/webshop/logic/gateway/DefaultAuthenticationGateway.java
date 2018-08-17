package com.webshop.logic.gateway;

import com.webshop.gateway.AuthenticationGateway;
import com.webshop.model.LoginData;
import com.webshop.model.RegistrationData;
import com.webshop.model.User;
import com.webshop.plugin.JsonParserPlugin;
import com.webshop.plugin.RestPlugin;

public class DefaultAuthenticationGateway implements AuthenticationGateway {
    private JsonParserPlugin jsonParserPlugin;
    private RestPlugin restPlugin;

    public DefaultAuthenticationGateway(JsonParserPlugin jsonParserPlugin, RestPlugin restPlugin) {
        this.jsonParserPlugin = jsonParserPlugin;
        this.restPlugin = restPlugin;
    }

    @Override
    public User login(LoginData loginData) {
        String body = jsonParserPlugin.toJson(loginData);

        String response = restPlugin.post("valahun", body);

        if (response != null) {
            return jsonParserPlugin.parse(response, User.class);
        }
        return null;
    }

    @Override
    public User registration(RegistrationData registrationData) {
        return null;
    }
}
