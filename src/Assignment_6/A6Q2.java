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
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
//Ask for the number of heights
        System.out.println("Please enter the number of heights being inputed");
        int j = input.nextInt();
        int sum = 0;
        //Ask for the heights
        System.out.println("Please enter the heights in centimeters");
        int[] h = new int[j];
        //Put the heights into an array
        for (int k = 0; k < j; k++) {
            h[k] = input.nextInt();
        }
        //Add all of the heights to sum
        for (int i = 0; i < j; i++) {
            sum = sum + h[i];
        }
        //Divide sum by the number of heights to get the average height
        sum = sum / j;
        //Print any heights that are above average
        System.out.println("The following heights are above average:");
        for (int g = 0; g < j; g++) {
            if(h[g] > sum){
                System.out.println(h[g]);
            }
        }
    }
}
