package com.webshop.gateway;

import com.webshop.model.User;

public interface AuthenticationGateway {
    User login(String username, String password);
    User registration(String username, String password, String email, String firstName, String lastName);
}
