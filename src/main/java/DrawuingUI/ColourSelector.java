package DrawuingUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColourSelector extends JPanel {
    private JButton btn1;
    private Color currentcolour;
    public ColourSelector(){
        currentcolour = Color.BLACK;
        btn1 = new JButton("Press me for different colour");
        add(btn1);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color newColour = JColorChooser.showDialog(
                        btn1, "Choose Colour", currentcolour);
                currentcolour=newColour;
                btn1.setBackground(currentcolour);
            }
        });

    }

    public Color getCurrentcolour() {
        return currentcolour;
    }
}
