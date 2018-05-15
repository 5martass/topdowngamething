package com.smartass.game.util;

/**
 * Created by smartass on Май, 2018
 */
public class Vector {

    public float x;
    public float y;

    public static float worldX;
    public static float worldY;

    public Vector() {
        x = 0;
        y = 0;
    }

    public Vector(Vector vec) {
        new Vector(vec.x, vec.y);
    }

    public Vector(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void addX(float f) { x += f; }
    public void addY(float f) { y += f; }

    public void setX(float f) { x = f; }
    public void setY(float f) { y = f; }

    public void setVector(Vector vec) {
        this.x = vec.x;
        this.y = vec.y;
    }

    public void setVector(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public static void setWorldVar(float x, float y) {
        worldX = x;
        worldY = y;
    }

    public Vector getWorldVar() {
        return new Vector(x - worldX, y - worldY);
    }

    @Override
    public String toString() {
        return x + ", " + y;
    }

}