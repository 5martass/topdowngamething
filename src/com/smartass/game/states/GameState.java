package com.smartass.game.states;

import com.smartass.game.util.KeyHandler;
import com.smartass.game.util.MouseHandler;

import java.awt.Graphics2D;

/**
 * Created by smartass on Май, 2018
 */
public abstract class GameState {

    private GameStateManager gsm;


    public GameState(GameStateManager gsm) {
        this.gsm = gsm;
    }

    public abstract void update();
    public abstract void input(MouseHandler mouse, KeyHandler key);
    public abstract void render(Graphics2D g);

}
