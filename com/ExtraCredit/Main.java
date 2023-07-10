package com.ExtraCredit;

/**Title:       com.ExtraCredit.Main.java
 * Description: This class is used to run the program
 *
 * @author      Yutao Cui; QMID: 210982631; BUPTID: 2021213180
 * @version     3.0 which is ExtraCredit
 * {@code @created}     2023.05.31
 */

public class Main {

    /** This constant is used to limit the maximum value of the input */
    protected static final int MaxInputRabbit = 20;
    /** This constant is used to limit the minimum value of the input */
    protected static final int MinInputRabbit = 10;


    /**
     * This class represents the main entry point of the application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        try {
            int inPutMax = Integer.parseInt(args[0]); //Gain the input from command

            /* Determine if the input is within the input range */
            if (inPutMax > MaxInputRabbit || inPutMax < MinInputRabbit) {
                System.out.println("Your input is not in the range.\n"
                                    + "Please enter a number between 10 and 20 correctly, the program exits normally.");
                System.exit(0); // the program exits normally
            } else { new Start(inPutMax); }

        }
        /* Catch Exceptions for non-numeric or empty inputs and handle them */
        catch (NumberFormatException | ArrayIndexOutOfBoundsException Ex) {
            System.out.println("You did not provide the correct identifiable number as an input.");
            System.out.println("The Exception is: " + Ex.getMessage() + ".");
            System.out.println("Please enter a number between 10 and 20 correctly.\n"
                                + "The program exits normally.");
            System.exit(0); // the program exits normally
        }

    } //Construct an anonymous object to run the program
}
