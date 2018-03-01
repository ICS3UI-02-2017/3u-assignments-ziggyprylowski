/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_4;

import java.util.Scanner;

/**
 *
 * @author prylz2189
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ask for the number of inches
        System.out.println("This program converts inches to centimeters. Please enter the number of inches here:");
        Scanner input = new Scanner(System.in);
        float numOfInches = input.nextFloat();
        //Mulitply number of inches by 2.54 and display a message about the results of the conversion
        System.out.println(numOfInches + (" inches is ") + (numOfInches * 2.54) + (" centimeters"));

    }
}
