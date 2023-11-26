package DrawuingUI;

import javax.swing.*;

public class ShapeCounter extends JPanel {
    private JLabel rectcounter;
    private JLabel circlecounter;
    private JLabel squarecounter;
    private int rc;
    private int cc;
    private int sc;
    public ShapeCounter(){
        rc = 0;
        cc = 0;
        sc = 0;
        rectcounter = new JLabel("Rectangle counter: " + rc);
        circlecounter = new JLabel("Circle counter: " + cc);
        squarecounter = new JLabel("Square counter: " + sc);
        add(rectcounter);
        add(circlecounter);
        add(squarecounter);
    }
    public void updateCC(){
        cc++;
        circlecounter.setText("Circle counter: " + cc);
    }
    public void updateRC(){
        rc++;
        rectcounter.setText("Rectangle counter: " + rc);
    }
    public void updateSC(){
        sc++;
        squarecounter.setText("Square counter: " + sc);
    }
}
