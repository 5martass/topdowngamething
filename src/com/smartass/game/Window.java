package com.smartass.game;

import javax.swing.*;

/**
 * Created by smartass on Май, 2018
 */
public class Window extends JFrame {

    public Window() {
        setTitle("butt");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new GamePanel(1280, 720));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
