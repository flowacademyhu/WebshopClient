package com.webshop.ui;

import javax.swing.*;
import java.awt.*;

public abstract class Frame extends JFrame {

    Font font;

    GridBagConstraints CreateWindow(int w, int h, String name, Font font) {
        setTitle(name);
        setSize(w, h);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); // ezzel záródik be az ablak.
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        setLocationRelativeTo(null); // ezzel középre nyitja az ablakot
        this.font = font;
        return c;
    }

    JLabel LabelFieldCreator(GridBagConstraints c, String s, int i) {
        JLabel lbl = new JLabel(s);
        lbl.setFont(font);
        lbl.setBackground(Color.lightGray);
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 1;
        c.gridx = 0;
        c.gridy = i;
        this.add(lbl, c);
        return lbl;
    }

    JButton ButtonCreator(GridBagConstraints c, int i) {
        JButton btn = new JButton("Login");
        btn.setFont(font);
        btn.setBackground(Color.lightGray);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 6;
        c.gridwidth = 2;
        c.weightx = 1;
        c.gridx = 0;
        c.gridy = i;
        this.add(btn, c);
        return btn;
    }

    JPasswordField PasswordFieldCreator(GridBagConstraints c, int i) {
        JPasswordField pf = new JPasswordField();
        pf.setFont(font);
        pf.setBackground(Color.lightGray);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 5;
        c.gridx = 1;
        c.gridy = i;
        this.add(pf, c);
        return pf;
    }

    JTextField TextFieldCreator(GridBagConstraints c, int i) {
        JTextField tf = new JTextField();
        tf.setFont(font);
        tf.setBackground(Color.lightGray);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 5;
        c.gridx = 1;
        c.gridy = i;
        this.add(tf, c);
        return tf;
    }
}
