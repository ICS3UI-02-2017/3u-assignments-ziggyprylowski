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
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int limit = input.nextInt();
        System.out.println("Enter the speed limit:");
        int speed = input.nextInt();
        System.out.println("Enter the recorded speed of the car");
        int result = (speed - limit);
        if (result <= 0) {
            System.out.println("Congratulations, you are within the speed limit! ");
        } else if (result >= 1 && result <= 20) {
            System.out.println("You are speeding and your fine is $100");
        } else if (result >= 21 && result <= 30) {
            System.out.println("You are speeding and your fine is $270");
        } else {
            (result >= 31){
            System.out.println("You are speeding and your fine is $500");
        }
    }
}

}