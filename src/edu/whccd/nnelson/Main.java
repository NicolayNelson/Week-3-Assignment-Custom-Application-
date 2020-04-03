package edu.whccd.nnelson;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// name output
        Scanner input = new Scanner (System.in);
        System.out.print ("Enter first name: ");
        String firstName = input.next();
        System.out.print ("Enter last name:  ");
        String lastName = input.next();
        System.out.println();
        System.out.println("Hello "+lastName+", "+firstName+"!");

        System.out.print ("**************** \n");

        // Set Numbers
        System.out.print ("Enter an whole number: ");
        int wholeNumber1 = input.nextInt();
        System.out.print ("Enter another whole number: ");
        int wholeNumber2 = input.nextInt();


        // calculate the results
        int addition = wholeNumber1 + wholeNumber2;
        int subtraction = wholeNumber1 - wholeNumber2;
        int multiplication = wholeNumber1 * wholeNumber2;
        int division = wholeNumber1 / wholeNumber2;
        int modulus = wholeNumber1 % wholeNumber2;

        // display the results
        System.out.println("Addition:       " +wholeNumber1 + " + " + wholeNumber2 + " = " + addition);
        System.out.println("Subtraction:    " +wholeNumber1 + " - " + wholeNumber2 + " = " + subtraction);
        System.out.println("Multiplication: " + wholeNumber1 + " * " + wholeNumber2 + " = " + multiplication);
        System.out.println("Division:       " + wholeNumber1 + " / " + wholeNumber2 + " = " + division);
        System.out.println("Modulus:        " + wholeNumber1 + " % " + wholeNumber2 + " = " + modulus);

    }
}
