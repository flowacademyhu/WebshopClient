package com.webshop.model;

public class RegistrationData {
    private String username;
    private String email;
    private String password;
    private String confirmedPassword;
    private String firstName;
    private String lastName;

    public RegistrationData(String username, String email, String password, String confirmedPassword, String firstName, String lastName) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.confirmedPassword = confirmedPassword;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmedPassword() {
        return confirmedPassword;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
