package com.Task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**Title:       com.Task1.Start.java
 * Description: This class constructs the GUI of "Sum It Up"
 *              and implements the basic logic
 * @author      Yutao Cui; QMID: 210982631; BUPTID: 2021213180
 * @version     1.0 which is com.Task1
 * {@code @created}     2023.05.31
 */

public class Start extends JFrame {
    /** This panel contains the component which is to tell the user what to do */
    private final TopPanel topPanel;
    /** to display the image "plus" */
    private final ImagePlus imagePlus;
    /** a panel to display the image "rabbit" on the left */
    private final ImageRabbit imageLeftRabbit;
    /** a panel to display the image "rabbit" on the right */
    private final ImageRabbit imageRightRabbit;
    /** to get input from the user */
    private final Text textK;
    /** a button to check answer */
    private final JButton button;
    /** the first additive number from user */
    private int inputA;
    /** the second additive number from user */
    private int inputB;
    /** the sum that user calculated */
    private int sunUp;
    /** correct answer to the first additive number */
    private int addA;
    /** correct answer to the second additive number */
    private int addB;
    /** correct sum */
    private int correctAnswer;

    /**
     * The constructor of com.Task1.Start class.
     * Instantiates a new com.Task1.Start.
     */
    public Start() {
        super("Welcome to Sum It Up!");    // The title of the top-level container--frame
        setLayout(new BorderLayout());          // Set up the layout manager

        /* Initialization of generated objects */
        topPanel = new TopPanel();
        imagePlus = new ImagePlus();
        imageLeftRabbit = new ImageRabbit();
        imageRightRabbit = new ImageRabbit();
        textK = new Text();

        imagePlus.setPreferredSize(new Dimension(600, 300));  // Fix the size of image "plus"

        /* Layout on the frame */
        add(BorderLayout.NORTH, topPanel);
        add(BorderLayout.CENTER, imagePlus);
        add(BorderLayout.WEST, imageLeftRabbit);
        add(BorderLayout.EAST, imageRightRabbit);
        add(BorderLayout.SOUTH, textK);

        button = new JButton("Check");

        /* Fix the size of 'Check' button */
        button.setPreferredSize(new Dimension(100, 30));

        /* set the listener of 'Check' button */
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (CheckIsEmpty()) {
                    // Nothing should happen if the user clicks the 'Check!' button
                    // while at least one of the text fields are empty
                    return;
                }

                /* Get the input from user and calculate the correct answer */
                inputA = Integer.parseInt(textK.textFieldA.getText());
                inputB = Integer.parseInt(textK.textFieldB.getText());
                sunUp  = Integer.parseInt(textK.textFieldSum.getText());
                addA = imageLeftRabbit.numberOfRabbit;
                addB = imageRightRabbit.numberOfRabbit;
                correctAnswer = addA + addB;

                /* Determine if the calculation is correct */
                boolean isValid = CheckInput(inputA, inputB, sunUp);
                if(isValid) {
                    CorrectUpdate();
                    button.addActionListener(this);
                } else WrongUpdate();
            }
        });
        textK.add(button);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 700);
        setVisible(true);
    }

    /**
     * This method determines whether there are empty inputs
     * @return the boolean which determines if at least one of the inputs is empty
     */
    public boolean CheckIsEmpty() {
        String inputTextA = textK.textFieldB.getText();
        String inputTextB = textK.textFieldB.getText();
        String inputTextSum = textK.textFieldSum.getText();
        return (inputTextA.isEmpty() || inputTextB.isEmpty() || inputTextSum.isEmpty());
    }
    /**
     *This method check inputs whether match the answer.
     * @param a   the first additive number
     * @param b   the second additive number
     * @param sum the sum of two additive numbers
     * @return the boolean which determines if the inputs match the answer
     */
    public boolean CheckInput(int a, int b, int sum) {
        return (a == addA) && (b == addB) && (sum == correctAnswer);
    }

    /**
     * This method update the hint to "Correct! Have another go?"
     * and the number of Rabbit images displayed for each of the two operands changes
     * Also, the three text fields are reset
     */
    public void CorrectUpdate() {
        topPanel.jLabel.setText("Correct! Have another go?");
        DeleteTextF();
        RefreshRabbit();
    }

    /**
     * This method update the hint to "Wrong! Try again!" when at least one of the input values entered is incorrect
     */
    public void WrongUpdate() {
        topPanel.jLabel.setText("Wrong! Try again!");
    }

    /**
     * This method is used to empty the input textField
     */
    public void DeleteTextF() {
        textK.textFieldA.setText("");
        textK.textFieldB.setText("");
        textK.textFieldSum.setText("");
    }

    /**
     * This method change the number of Rabbit images displayed for each of the two operands
     */
    public void RefreshRabbit() {
        imageLeftRabbit.UpdateIcon();
        imageRightRabbit.UpdateIcon();
    }
}
