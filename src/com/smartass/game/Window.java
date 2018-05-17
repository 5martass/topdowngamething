package com.smartass.game;

import javax.swing.*;

/**
 * Created by smartass on Май, 2018
 */
public class Window extends JFrame {

    public Window() {
        setTitle("butt");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new GamePanel(800, 600));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
