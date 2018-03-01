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
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ask the user to input 4 numbers on different lines
        System.out.println("Please enter four numbers on seperate lines");
    Scanner input = new Scanner(System.in);
   float numberOne = input.nextFloat();
   float numberTwo = input.nextFloat();
   float numberThree = input.nextFloat();
   float numberFour = input.nextFloat();
   //Print the four numbers with a comma and a space after the first three
        System.out.print(numberOne + ", ");
        System.out.print(numberTwo + ", ");
        System.out.print(numberThree + ", ");
        System.out.print(numberFour);
    }
}
