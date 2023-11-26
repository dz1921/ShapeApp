package DrawuingUI;

import javax.swing.*;
import java.awt.*;

public class RectDimSelector extends JPanel {
    private JSlider width;
    private JSlider height;
    public RectDimSelector(){
        width = new JSlider(0, 100, 1);
        height = new JSlider(0, 100, 1);
        JLabel label = new JLabel("Rectangle Width and Height");
        JPanel mypanel = new JPanel();
        mypanel.setLayout(new GridLayout(3,1));
        mypanel.add(label);
        mypanel.add(width);
        mypanel.add(height);
        add(mypanel);
    }
    public int getRectHeight(){
        return height.getValue();
    }
    public int getRectWidth(){
        return width.getValue();
    }
}
