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
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
        System.out.println("How many marks would you like to enter?");
        int markNum = input.nextInt();
        //Ask user to enter the marks
        System.out.println("Please enter the marks");
    double[] marks = new double[markNum];
    //Input the marks into an array
        for (int i = 0; i < markNum; i++) {
            marks[i] = input.nextInt();
        }
        //go through the array exchanging marks beside eachother into ascending order
        for (int f = 0; f < markNum*100; f++) {
            
        
        for (int j = 0; j < markNum-1; j++) {
            if(marks[j] > marks[j + 1]){
              double q = marks[j + 1];
              marks[j + 1] = marks[j];
              marks[j] = q;
            }
        }
        }
        //Print the marks in ascending order
                System.out.println("The marks in ascending order are:");
                for (int y = 0; y < markNum; y++) {
                    System.out.print(" " + marks[y] + ", ");
                 
        }//If the number is even find the media and take the average and print it
                //If the number is odd find the median and print it
                if((markNum%2)==0){
                    int t = markNum/2;
                    double u = ((marks[t] + marks[t-1])/2);
                    System.out.println("The median is " + u);
                }else{
                    double w = markNum / 2;
                    double a = Math.ceil(w);
                    int c = (int) a;
                    System.out.println("The median is " + marks[c]);
                }
    }
}
