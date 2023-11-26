package DrawuingUI;

import javax.swing.*;

public class SquareSIdeSelector extends JPanel{
    private JSlider jside;
    public SquareSIdeSelector(){
        jside = new JSlider(0, 100,1);
        JLabel label = new JLabel("Square Side");
        add(label);
        add(jside);
    }
    public int getSide(){
        return jside.getValue();
    }
}
