package com.webshop.interactor;

import com.webshop.gateway.AuthenticationGateway;
import com.webshop.model.User;

public class SessionManager {
    private AuthenticationGateway authenticationGateway;

    public SessionManager(AuthenticationGateway authenticationGateway) {
        this.authenticationGateway = authenticationGateway;
    }

    public User login(String username, String password) {
        if(!username.trim().isEmpty() && !password.trim().isEmpty()){
            return authenticationGateway.login(username, password);
        }
        return null;
    }

    public User registration(String username, String password, String confirmPassword, String email, String firstName, String lastName){
       // TODO:
        return null;
    }
}
