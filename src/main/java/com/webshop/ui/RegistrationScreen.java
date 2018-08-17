package com.webshop.ui;

import java.awt.*;

public class RegistrationScreen extends Frame {

    public RegistrationScreen() {
        GridBagConstraints c = CreateWindow(300, 200, "Registration", new Font(Font.SANS_SERIF, Font.BOLD, 12));
        LabelFieldCreator(c, "First name:", 0);
        TextFieldCreator(c, 0);
        LabelFieldCreator(c, "Last name:", 1);
        TextFieldCreator(c, 1);
        LabelFieldCreator(c, "E-mail:", 2);
        TextFieldCreator(c, 2);
        LabelFieldCreator(c, "Password:", 3);
        PasswordFieldCreator(c, 3);
        LabelFieldCreator(c, "Repeat password:", 4);
        PasswordFieldCreator(c, 4);
        ButtonCreator(c, 5);
    }

}
