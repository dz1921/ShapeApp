package Shapes;

import Shapes.Circle;
import Shapes.Rect;
import Shapes.Shape;
import Shapes.Square;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Drawing extends Canvas {
    private ShapeDB shapeDB;

    //private Circle kruh;
    //private Rect obd;
    //private Square ctv;
    public Drawing(){
        shapeDB = new ShapeDB();
        //Circle kruh = new Circle(p1, c, height);
        //Rect obd = new Rect(p2, c, width, height);
        //Square ctv = new Square(p3, c, width, height);

        //this.MyList.add(kruh);
        //this.MyList.add(obd);
        //this.MyList.add(ctv);


    }
    public void paint(Graphics g){
        shapeDB.drawShapes(g);
    }

    public void addCircle(Point p, Color c, int radius){
        shapeDB.addCircle(p, c, radius);
    }
    public void addRect(Point p, Color c, int width, int height){
        shapeDB.addRect(p, c, width, height);
    }
    public void addSquare(Point p, Color c, int side){
        shapeDB.addSquare(p, c, side);
    }
}
