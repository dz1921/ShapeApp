package DrawuingUI;

import javax.swing.*;

public class CircleDImsSelector extends JPanel {
    private JSlider radius;
    public CircleDImsSelector(){
        radius = new JSlider(0,100,1);
        JLabel radiuslabel = new JLabel("Circle Radius");
        add(radiuslabel);
        add(radius);

    }
    public int getCurrentRadius(){
        return radius.getValue();
    }
}
