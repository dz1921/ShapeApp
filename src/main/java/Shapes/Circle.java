package Shapes;

import java.awt.*;

public class Circle extends Shape{
    private int radius;

    public Circle(Point p, Color c, int radius){
        super(p, c);
        this.radius = radius;
    }
    @Override
    protected void Draw(Graphics g){
        g.setColor(c);
        g.fillOval(p.x, p.y, radius, radius);
    }
}
