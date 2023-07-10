package com.Task1;

import javax.swing.*;
import java.awt.*;

/**
 * Title:       com.Task1.Text.java
 * Description: This class constructs the textField of "Sum It Up"
 *
 * @author Yutao Cui; QMID: 210982631; BUPTID: 2021213180
 * @version 1.0 which is com.Task1
 * {@code @created} 2023.05.31
 */

public class Text extends JPanel {

    /** the first textField for the first additive number */
    protected JTextField textFieldA;
    /** the second textField for the second additive number */
    protected JTextField textFieldB;
    /** the third textField for the sum of two additive numbers */
    protected JTextField textFieldSum;


    /**
     * Instantiates a new com.Task1.Text.
     */
    public Text() {
        super();
        /* Choose layout */
        FlowLayout flowLayoutOfBottom = new FlowLayout();
        setLayout(flowLayoutOfBottom);

        textFieldA = new JTextField();
        textFieldB = new JTextField();
        textFieldSum = new JTextField();

        /* Fix the size of textFields */
        textFieldA.setPreferredSize(new Dimension(60, 30));
        textFieldB.setPreferredSize(new Dimension(60, 30));
        textFieldSum.setPreferredSize(new Dimension(60, 30));

        /* Add the labels to panel */
        add(textFieldA);
        add(new Label("+"));
        add(textFieldB);
        add(new Label("="));
        add(textFieldSum);
    }
}

