package com.hspedu.tankgame;

public class Tank {
    private int x;
    private int y;
    private int direct = 0;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    private int speed = 1;

    //上右下左移动方法
    public void moveup(){
        y -= speed;
    }
    public void moveright(){
        x += speed;
    }
    public void movedown(){
        y += speed;
    }
    public void moveleft(){
        x -= speed;
    }

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


}
