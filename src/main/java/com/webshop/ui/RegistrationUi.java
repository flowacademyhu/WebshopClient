package com.webshop.ui;

import javax.swing.*;
import java.awt.*;

public class RegistrationUi extends JFrame {
    public RegistrationUi() {
        setSize(350, 300);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLayout(new GridBagLayout());
        setLocationRelativeTo(null);
        setVisible(true);
        JButton registerButton = new JButton("Register");

        JTextField nameField = new JTextField();
        JTextField lastNameField = new JTextField();
        JTextField firstNameField = new JTextField();
        JTextField emailField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        JPasswordField rePasswordField = new JPasswordField();

        JLabel nameTxt = new JLabel("Username:");
        JLabel passTxt = new JLabel("Password:");
        JLabel rePassTxt = new JLabel("Confirm password:");
        JLabel emailTxt = new JLabel("E-mail:");
        JLabel firstNameTxt = new JLabel("First name:");
        JLabel lastNameTxt = new JLabel("Last name:");

        setTitle("Registration");


        GridBagConstraints gc = new GridBagConstraints();
// grid x column, grid y line. weight ratio; fill

        gc.gridx = 1;
        gc.gridy = 1;
        gc.weightx = 1;
        gc.fill = GridBagConstraints.NONE;
        add(nameTxt, gc);

        gc.gridx = 2;
        gc.gridy = 1;
        gc.weightx = 5;
        gc.fill = GridBagConstraints.BOTH;
        add(nameField, gc);

        gc.gridx = 1;
        gc.gridy = 2;
        gc.weightx = 1;
        gc.fill = GridBagConstraints.NONE;
        add(passTxt, gc);

        gc.gridx = 2;
        gc.gridy = 2;
        gc.weightx = 5;
        gc.fill = GridBagConstraints.BOTH;
        add(passwordField, gc);

        gc.gridx = 2;
        gc.gridy = 3;
        gc.weightx = 5;
        gc.fill = GridBagConstraints.BOTH;
        add(registerButton, gc);

    }
}
