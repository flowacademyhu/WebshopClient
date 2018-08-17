package com.webshop.ui;

import javax.swing.*;
import java.awt.*;

public class LoginUi extends JFrame{


    public LoginUi() {
        setSize(350, 100);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLayout(new GridBagLayout());

        setLocationRelativeTo(null);

        JButton loginButton = new JButton("LOGIN");
        JTextField nameField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        JLabel nameTxt = new JLabel("Username:");
        JLabel passTxt = new JLabel("Password:");
        setTitle("Login");
        setVisible(true);
        GridBagConstraints gc = new GridBagConstraints();

        gc.gridwidth = 1;
        gc.gridx = 1;
        gc.gridy = 1;
        gc.weightx = 1;
        gc.fill = GridBagConstraints.NONE;
        add(nameTxt, gc);
        gc.gridwidth = 2;
        gc.gridx = 2;
        gc.gridy = 1;
        gc.weightx = 5;
        gc.fill = GridBagConstraints.HORIZONTAL;
        add(nameField, gc);
        gc.gridwidth = 1;
        gc.gridx = 1;
        gc.gridy = 2;
        gc.weightx = 1;
        gc.fill = GridBagConstraints.NONE;
        add(passTxt, gc);
        gc.gridwidth = 2;
        gc.gridx = 2;
        gc.gridy = 2;
        gc.weightx = 5;
        gc.fill = GridBagConstraints.HORIZONTAL;
        add(passwordField, gc);
        gc.gridx = 2;
        gc.gridy = 3;
        gc.weightx = 5;
        gc.fill = GridBagConstraints.HORIZONTAL;
        add(loginButton, gc);

    }
}
