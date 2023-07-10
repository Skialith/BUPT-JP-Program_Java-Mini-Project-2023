package com.Task2;

import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.util.Arrays;
import java.util.Random;

/**
 * Title:       com.Task2.ImageRabbit.java
 * Description: This class is used to display and refresh rabbit images
 *
 * @author Yutao Cui; QMID: 210982631; BUPTID: 2021213180
 * @version 2.0 which is com.Task2 {@code @created}     2023.05.31
 */
public class ImageRabbit extends JPanel {

    /** The maximum number of images to display */
    final int Max_Images = 10;
    /** Array of image labels */
    private final JLabel[] imageLabels;
    /** Array of images */
    private final ImageIcon[] images;
    /** Randomly generated additions */
    protected int numberOfRabbit = (int)(Math.random() * 10) + 1;

    /**
     * Instantiates a new Image rabbit.
     */
    public ImageRabbit(){
        super();
        /* Choose layout */
        FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT,0,0);
        setPreferredSize(new Dimension(218, 240));
        setLayout(flowLayout);

        images = new ImageIcon[Max_Images];
        imageLabels = new JLabel[Max_Images];

        /* Convert image files to Icon */
        for (int i = 0; i < Max_Images; i++) {
            images[i] = generateRandomImage();
        }

        /* Store Icon in label array */
        for (int i = 0; i < numberOfRabbit; i++) {
            imageLabels[i] = new JLabel(images[i]);
            add(imageLabels[i]);
        }
    }

    /**
     * This method turn 'rabbit.jpg' to ImageIcon
     * @return ImageIcon of 'rabbit.jpg'
     */
    private ImageIcon generateRandomImage() {
        return new ImageIcon("rabbit.jpg");
    }

    /**
     * Updates the displayed icons by selecting a new number of rabbit images to display.
     */
    protected void UpdateIcon() {
        removeAll();
        revalidate(); // Refresh the layout
        repaint();    // Repaint
        Arrays.fill(imageLabels,null); //Clear the array

        Random random = new Random();
        numberOfRabbit = random.nextInt(10) + 1; //Randomly generated additions again

        /* Store Icon in label array and add label on panel */
        for (int i = 0; i < numberOfRabbit; i++) {
            imageLabels[i] = new JLabel(images[i]);
            add(imageLabels[i]);
        }
    }
}
