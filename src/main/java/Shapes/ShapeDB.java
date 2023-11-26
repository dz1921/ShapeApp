package Shapes;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ShapeDB {
    private ArrayList<Shape> shapes;

    public ShapeDB() {
        shapes = new ArrayList<>();
    }

    void addSquare(Point p, Color c, int side) {
        Square sq = new Square(p, c, side, side);
        shapes.add(sq);
    }

    void addCircle(Point p, Color c, int radius) {
        Circle cir = new Circle(p, c, radius);
        shapes.add(cir);
    }

    void addRect(Point p, Color c, int width, int height) {
        Rect rect = new Rect(p, c, width, height);
        shapes.add(rect);
    }

    void drawShapes(Graphics g) {
        //g.setColor(Color.black);
        //g.drawLine(0, 0, 1000, 1000);
        for (Shape shape : shapes) {
            shape.Draw(g);
        }
    }
}
