package com.smartass.game.states;

import com.smartass.game.util.KeyHandler;
import com.smartass.game.util.MouseHandler;

import java.awt.*;

/**
 * Created by smartass on Май, 2018
 */
public class PlayState extends GameState {

    public PlayState(GameStateManager gsm) {
        super(gsm);
    }

    public void update() {

    }

    public void input(MouseHandler mouse,KeyHandler key) {

    }

    public void render(Graphics2D g){
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0, 0, 64, 64);

    }

}
