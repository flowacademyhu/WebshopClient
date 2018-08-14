package com.webshop.ui;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        EventQueue.invokeLater(()-> {
            Main main = new Main();
            main.setVisible(true);
        });
    }

    public Main() {
        setTitle("Webshop");
        setSize(500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
    }

}
