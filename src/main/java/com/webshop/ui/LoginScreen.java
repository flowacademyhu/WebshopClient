package com.webshop.ui;

import java.awt.*;

public class LoginScreen extends Frame{

    public LoginScreen() {
        GridBagConstraints c = CreateWindow(300, 120, "Login", new Font(Font.SANS_SERIF, Font.BOLD, 12));
        LabelFieldCreator(c, "Username:", 0);
        TextFieldCreator(c, 0);
        LabelFieldCreator(c, "Password:", 1);
        PasswordFieldCreator(c, 1);
        ButtonCreator(c, 2);
    }
}
