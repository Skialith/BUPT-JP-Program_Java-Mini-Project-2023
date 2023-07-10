package com.ExtraCredit;

import javax.swing.*;

/**
 * Title:       com.ExtraCredit.TopPanel.java
 * Description: This class constructs the topPanel of "Sum It Up"
 *
 * @author Yutao Cui; QMID: 210982631; BUPTID: 2021213180
 * @version 3.0 which is ExtraCredit
 * {@code @created} 2023.05.31
 */

public class TopPanel extends JPanel {

    /** a label to provide hints to users */
    protected JLabel jLabel;

    /**
     * Instantiates a new Top panel.
     */
    public TopPanel() {
        super();
        //The initial text should be ‘Enter two operands, result and click on 'Check!'
        jLabel = new JLabel("Enter two operands, result and click on 'Check!'");
        add(jLabel);
    }
}
