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
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Ask user to enter class size
        System.out.println("Please enter the size of the class");
        int classSize = input.nextInt();
        //Ask user to enter the marks
        System.out.println("Please enter the marks of the class");
        int marks[] = new int[classSize];
        //Input the marks for the class into an array
        for (int i = 0; i < classSize; i++) {
            marks[i] = input.nextInt();
        }
        //Swap all of marks into ascending order
        for (int i = 0; i < classSize * 1000; i++) {

            for (int j = 0; j < classSize - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    int q = marks[j + 1];
                    marks[j + 1] = marks[j];
                    marks[j] = q;
                }
            }
        }
        //Print highest and lowest mark
        System.out.println("The lowest mark is: " + marks[0]);
        System.out.println("The highest mark is: " + marks[classSize - 1]);
        //Calculate sum and print it
        int sum = 0;
        for (int w = 0; w < classSize; w++) {
            sum = sum + marks[w];
        }
        sum = sum / classSize;
        System.out.println("The class average is: " + sum);
    }
}
