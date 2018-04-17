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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Ask for the number of students in the class
        System.out.println("How many students are in the class?");
        String i = input.nextLine();
        int j = Integer.parseInt(i);
        double sum = 0;
        //Ask for marks of the students
        System.out.println("Please enter the marks of the students");
        double[] marks = new double[j];
        //Input the marks of the students
        for (int k = 0; k < j; k++) {
            marks[k] = input.nextDouble();
        }
        //Add the marks of the students
        for (int h = 0; h < j; h++) {
            sum = sum + marks[h];
        }
        //Divide sum by number of students
        double total = sum / j;
        //Round to 2 decimal places and print
        System.out.printf("The average is %.2f%% \n", total);
    }
}
