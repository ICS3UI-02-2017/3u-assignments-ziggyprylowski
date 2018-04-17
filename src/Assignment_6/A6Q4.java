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
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ask user to enter the marks
        System.out.println("Please enter the 10 marks");
    Scanner input = new Scanner(System.in);
    double[] marks = new double[10];
    //Input the 10 marks into an array
        for (int i = 0; i < 10; i++) {
            marks[i] = input.nextInt();
        }
        //go through the array exchanging marks beside eachother into ascending order
        for (int f = 0; f < 100; f++) {
            
        
        for (int j = 0; j < 9; j++) {
            if(marks[j] > marks[j + 1]){
              double q = marks[j + 1];
              marks[j + 1] = marks[j];
              marks[j] = q;
            }
        }
        }
        //Print the marks in ascending order
                System.out.println("The marks in ascending order are " + marks[0] + ", " + marks[1]  + ", " + marks[2] + ", " + marks[3] + ", " + marks[4] + ", " + marks[5] + ", " + marks[6] + ", " + marks[7] + ", " + marks[8] + ", " + marks[9] + ", ");
    }
}
