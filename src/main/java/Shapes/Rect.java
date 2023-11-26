package Shapes;

import java.awt.*;

public class Rect extends Shape{
    protected int width;
    protected int height;
    public Rect(Point p, Color c, int width, int height){
        super(p,c);
        this.height = height;
        this.width = width;
    }


    protected void Draw(Graphics g) {
        g.setColor(c);
        g.fillRect(p.x, p.y, height, width);
    }
}
