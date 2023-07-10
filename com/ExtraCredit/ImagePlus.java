package com.ExtraCredit;

import javax.swing.*;
import java.awt.*;

/**Title:       com.ExtraCredit.ImagePlus.java
 * Description: This class is the image of 'plus'
 *
 * @author      Yutao Cui; QMID: 210982631; BUPTID: 2021213180
 * @version     3.0 which is ExtraCredit
 * {@code @created}     2023.05.31
 */

public class ImagePlus extends JPanel {
    /**
     * Instantiates a new Image plus.
     */
    public ImagePlus() {
        super();
        setLayout(new BorderLayout()); // Set up the layout manager
        JLabel jLabelPlus = new JLabel(new ImageIcon("plus.png"));
        add(jLabelPlus, BorderLayout.CENTER);
    }
}
