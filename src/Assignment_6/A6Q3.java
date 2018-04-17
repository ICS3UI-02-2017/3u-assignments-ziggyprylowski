/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_6;

import java.util.Scanner;

/**
 *
 * @author prylz2189
 */
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a two spaced array
        int[] array = new int[2];
        Scanner input = new Scanner(System.in);
        //Ask for the two integers
        System.out.println("Please enter two integers");
        for (int i = 0; i < 2; i++) {
            array[i] = input.nextInt();
        }
        //If the integer in the first spot is greater than the integer in the second spot swap their places
        if (array[0] > array[1]) {
            int one = array[0];
            int two = array[1];
            array[1] = one;
            array[0] = two;
        }
        //Output the numbers in ascending order
        System.out.println("The numbers in ascending order are:" + array[0] + ", " + array[1]);
    }
}
