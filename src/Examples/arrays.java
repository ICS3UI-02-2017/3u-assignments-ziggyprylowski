/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import java.util.Scanner;

/**
 *
 * @author prylz2189
 */
public class arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
//Make an array to sotore expenses
double[] expenses = new double[6];
//Let the user know to get the costs
        System.out.println("please enter the six costs for prom");
        for (int i = 0; i < expenses.length; i++) {
            expenses[i] = input.nextDouble();
        }
        
        double sum = 0;
        for (int i = 0; i < expenses.length; i++) {
            //Get the expense
            double expense = expenses[i];
            //Add it to the sum
            sum = sum + expense;
        }











   }
}
