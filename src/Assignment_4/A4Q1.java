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
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ask user to enter name
        System.out.println("Please enter name:");
        Scanner input = new Scanner(System.in);
        String userName = input.nextLine();
        //Print hello and their name
        System.out.println("Hello " + userName);
    }
}
