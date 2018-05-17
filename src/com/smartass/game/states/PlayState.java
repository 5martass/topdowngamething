package com.smartass.game.states;

import com.smartass.game.graphics.Font;
import com.smartass.game.graphics.Sprite;
import com.smartass.game.util.KeyHandler;
import com.smartass.game.util.MouseHandler;
import com.smartass.game.util.Vector;

import java.awt.*;

/**
 * Created by smartass on Май, 2018
 */
public class PlayState extends GameState {

    private Font font;

    public PlayState(GameStateManager gsm) {
        super(gsm);
        font = new Font("font/font1.png", 16, 16);
    }

    public void update() {

    }

    public void input(MouseHandler mouse,KeyHandler key) {


    }

    public void render(Graphics2D g){
        Sprite.drawArray(g, font, "BUTTHOLE", new Vector(100, 100),32, 32, 16, 0);

    }

}
