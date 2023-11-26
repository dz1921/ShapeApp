package Shapes;

import java.awt.*;

public class Square extends Rect {
    public Square(Point p, Color c, int width, int height){
        super(p,c,width,height);
        this.height = width;
    }
}
