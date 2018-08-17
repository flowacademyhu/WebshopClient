package com.webshop.interactor;

import com.webshop.gateway.AuthenticationGateway;
import com.webshop.model.LoginData;
import com.webshop.model.RegistrationData;
import com.webshop.model.User;

public class SessionManager {
    private AuthenticationGateway authenticationGateway;


    public SessionManager(AuthenticationGateway authenticationGateway) {
        this.authenticationGateway = authenticationGateway;
    }

    private User login(String username, String password) {
        if(!username.trim().isEmpty() && !password.trim().isEmpty()) {
            return authenticationGateway.login(new LoginData(username, password));
        }
        return null;
    }

    private User registration(String username, String password, String confirmedPassword, String email, String firstName, String lastName) {
        if(!username.trim().isEmpty() && !password.trim().isEmpty() && password.equals(confirmedPassword) && !email.trim().isEmpty() && !firstName.trim().isEmpty() && !lastName.trim().isEmpty()) {
            return authenticationGateway.registration(new RegistrationData(username, email, password, confirmedPassword, firstName, lastName));
        }
        return null;
    }

}
