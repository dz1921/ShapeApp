package DrawuingUI;

import javax.swing.*;

public class ShapeSelector extends JPanel {
    private JRadioButton bCirc;
    private JRadioButton bRect;
    private JRadioButton bSquare;

    public ShapeSelector(){
        bCirc = new JRadioButton("Circle");
        bRect = new JRadioButton("Rectangle");
        bSquare = new JRadioButton("Square");
        ButtonGroup bg = new ButtonGroup();
        bg.add(bCirc);
        bg.add(bRect);
        bg.add(bSquare);
        add(bCirc);
        add(bRect);
        add(bSquare);
        bCirc.setSelected(true);
    }
    public String getCurrentShape(){
        String currentshape = new String();
        if (bCirc.isSelected()){
            currentshape = "Circle";
        }
        else if (bRect.isSelected()) {
            currentshape = "Rectangle";
        }
        else if (bSquare.isSelected()) {
            currentshape = "Square";
        }
        return currentshape;
    }
}
