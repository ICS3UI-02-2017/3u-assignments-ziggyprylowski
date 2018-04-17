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
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int player = 0;
        int dice;
        while (true) {
            System.out.println("Enter sum of dice");
            dice = input.nextInt();
            //Ask for the sum of the dice and move the player to the appropriate square
            //If the dice value is not acceptable do not accept the value and ask again
            //If the sum is 0 terminate program
            if (dice < 0 || dice > 12 || dice == 1) {
                System.out.println("Please enter acceptable value");
            } else if (dice == 0) {
                System.out.println("You quit");
                break;
            } else if (dice <= 12 && dice >= 2) {
                player = player + dice;
                System.out.println("You are now on square " + player);
                //Send player to appropriate square when they hit a snake or ladder
                //Terminate the program when the player wins
                if (player == 54) {
                    player = 19;
                    System.out.println("You landed on a snake! You are now on square 19");
                } else if (player == 90) {
                    player = 48;
                    System.out.println("You landed on a snake! You are now on square 48");
                } else if (player == 99) {
                    player = 77;
                    System.out.println("You landed on a snake! You are now on square 77");
                } else if (player == 9) {
                    player = 34;
                    System.out.println("You landed on a ladder! You are now on square 34");
                } else if (player == 40) {
                    player = 64;
                    System.out.println("You landed on a ladder! You are now on square 64");
                } else if (player == 67) {
                    player = 86;
                    System.out.println("You landed on a ladder! You are now on square 86");
                } else if (player >= 100) {
                    System.out.println("Congratulations you win!!!");
                    break;
                }
            }
        }
    }
}