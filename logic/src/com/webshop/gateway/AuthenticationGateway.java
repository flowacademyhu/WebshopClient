package com.webshop.gateway;

import com.webshop.model.LoginData;
import com.webshop.model.RegistrationData;
import com.webshop.model.User;

public interface AuthenticationGateway {
    User login(LoginData loginData);
    User registration(RegistrationData registrationData);

}
