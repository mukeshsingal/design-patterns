package Structural.FlywightPattern;

import java.awt.*;

public class MyRact {
    private Color color;
    private int x, y, x2, y2;

    MyRact(Color color) {
        this.color = color;
    }

    public void draw(Graphics g, int x, int y, int x2, int y2) {
        g.setColor(color);
        g.fillRect(x, y, x2, y2);
    }

    /*public MyRact(Color color, int x, int y, int x2, int y2) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void draw(Graphics g) {
         g.setColor(color);
         g.fillRect(x, y ,x2, y2);
    }*/
}
