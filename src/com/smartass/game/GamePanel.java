package com.smartass.game;

import javax.swing.*;
import java.awt.*;

/**
 * Created by smartass on Май, 2018
 */
public class GamePanel extends JPanel {

    public static int width;
    public static int height;

    public GamePanel(int width, int height) {
        setPreferredSize(new Dimension(width, height));
        setFocusable(true);
        requestFocus();
    }

}
