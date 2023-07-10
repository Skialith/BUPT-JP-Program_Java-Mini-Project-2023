package com.ExtraCredit;

import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.util.Arrays;
import java.util.Random;

/**
 * Title:       com.ExtraCredit.Start.java
 * Description: This class is used to display and refresh rabbit images
 *
 * @author Yutao Cui; QMID: 210982631; BUPTID: 2021213180
 * @version 3.0 which is ExtraCredit
 * {@code @created}     2023.05.31
 */
public class ImageRabbit extends JPanel {
    /** The maximum number of images to display */
    protected final int max_Images;
    /** Array of image labels */
    private final JLabel[] imageLabels;
    /** Array of images */
    private final ImageIcon[] images;
    /** Randomly generated additions */
    protected int numberOfRabbit;

    /**
     * Constructs a new ImageRabbit panel with the specified maximum number of images.
     *
     * @param max The maximum number of images to display.
     */
    public ImageRabbit(int max) {
        super();
        max_Images = max;
        numberOfRabbit = (int) (Math.random() * max_Images) + 1; //Generate random numbers from input

        /* Choose layout */
        FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT, 0, 0);
        setPreferredSize(new Dimension(290, 240));
        setLayout(flowLayout);

        images = new ImageIcon[max_Images];
        imageLabels = new JLabel[max_Images];

        /* Convert image files to Icon */
        for (int i = 0; i < max_Images; i++) {
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
        Arrays.fill(imageLabels, null); //Clear the array

        Random random = new Random();
        numberOfRabbit = random.nextInt(max_Images) + 1; //Randomly generated additions again

        /* Store Icon in label array */
        for (int i = 0; i < numberOfRabbit; i++) {
            imageLabels[i] = new JLabel(images[i]);
            add(imageLabels[i]);
        }
    }
}
