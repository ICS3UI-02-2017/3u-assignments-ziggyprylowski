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
public class InputOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*  System.out.println("Hello World");
        System.out.println("Another Line!");
        System.out.println("");
        System.out.print("Not A New ");
        System.out.print("Line");
        System.out.println(" \"Im inside quotation marks\" ");
        System.out.println("A slash\\");
        System.out.println("\t");
        System.out.println("hi /s is a space");
        System.out.println("Hello\n is a new line");
        int age = 16;
        System.out.println(age);
        System.out.println("I am " + age + " years old"); */
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Name:");
        String userName = input.nextLine();
        System.out.println("Hello " + userName);
        System.out.println("What year were you born?");
        int userAge = input.nextInt();
        System.out.println("You are " + (2018 - userAge) + " years old!");
        if(userAge > 25){
            System.out.println("Holy shit youre old!");
        }else{
            System.out.println("Youre a good age bro!");
            
        }
    }
}
