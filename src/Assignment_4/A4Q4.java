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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ask the user to enter all of the costs
        Scanner input = new Scanner(System.in);
        System.out.println("How much does the food for prom cost?");
        float foodCost = input.nextFloat();
        System.out.println("How much does the DJ cost?");
        float djCost = input.nextFloat();
        System.out.println("How much is the cost to rent the hall?");
        float rentCost = input.nextFloat();
        System.out.println("How much does decorations cost?");
        float decorCost = input.nextFloat();
        System.out.println("How much does it cost for staff?");
        float staffCost = input.nextFloat();
        System.out.println("How much for miscellaneous costs?");
        float miscCost = input.nextFloat();
        //Add all of the costs
        float totalCost = (foodCost + djCost + rentCost + decorCost + staffCost + miscCost);
        System.out.println("Your total cost is $" + totalCost);
        //Divide all the costs by 35 to calculate the number of tickets needed to break even then round it up and display this to the user
        float numberOfTickets = totalCost / 35;
        System.out.println("You must sell " + Math.ceil(numberOfTickets) + "tickets to break even");
    }
}
