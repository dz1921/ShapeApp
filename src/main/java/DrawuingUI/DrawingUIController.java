package DrawuingUI;

import DrawuingUI.ShapeSelector;
import Shapes.Drawing;
import Shapes.Square;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawingUIController {
    private Drawing drawing;
    private JPanel controlsPanel;
    private JPanel mainPanel;
    public DrawingUIController(){
        Drawing drawing = new Drawing();
        ShapeCounter shapeCounter = new ShapeCounter();
        ShapeSelector shapeSelector = new ShapeSelector();
        ColourSelector colourSelector = new ColourSelector();
        CircleDImsSelector circleDImsSelector = new CircleDImsSelector();
        RectDimSelector rectDimSelector = new RectDimSelector();
        SquareSIdeSelector squareSIdeSelector = new SquareSIdeSelector();
        JLabel mylabel = new JLabel("Circle counter: 0");
        drawing.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                Point p = new Point(0,0);
                p = e.getPoint();
                String control = shapeSelector.getCurrentShape();
                if (control == "Circle"){
                    drawing.addCircle(p, colourSelector.getCurrentcolour(), circleDImsSelector.getCurrentRadius());
                    shapeCounter.updateCC();
                }
                else if (control == "Square") {
                    drawing.addSquare(p, colourSelector.getCurrentcolour(), squareSIdeSelector.getSide());
                    shapeCounter.updateSC();
                }
                else if (control == "Rectangle") {
                    drawing.addRect(p, colourSelector.getCurrentcolour(),rectDimSelector.getRectWidth(), rectDimSelector.getRectHeight());
                    shapeCounter.updateRC();
                }
                drawing.repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        controlsPanel = new JPanel();
        mainPanel = new JPanel();


        controlsPanel.setLayout(new GridLayout(6,1));
        controlsPanel.add(shapeSelector);
        controlsPanel.add(colourSelector);
        controlsPanel.add(rectDimSelector);
        controlsPanel.add(circleDImsSelector);
        controlsPanel.add(squareSIdeSelector);
        controlsPanel.add(shapeCounter);
        mainPanel.setLayout(new GridLayout(2,1));
        mainPanel.add(drawing);
        mainPanel.add(controlsPanel);


    }
    public JPanel getMainPanel(){
        return mainPanel;
    }
}
