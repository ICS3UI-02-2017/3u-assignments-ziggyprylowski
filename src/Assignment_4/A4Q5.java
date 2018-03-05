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
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ask the user for their name
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter name");
        String userName = input.nextLine();
        //Ask user to input what the tests were out of and their score
        System.out.println("What was test one out of?");
        float testOne = input.nextFloat();
        System.out.println("What was your score on test one?");
        float scoreOne = input.nextFloat();
        System.out.println("What was test two out of?");
        float testTwo = input.nextFloat();
        System.out.println("What was your score on test Two?");
        float scoreTwo = input.nextFloat();
        System.out.println("What was test three out of?");
        float testThree = input.nextFloat();
        System.out.println("What was your score on test three?");
        float scoreThree = input.nextFloat();
        System.out.println("What was test four out of?");
        float testFour = input.nextFloat();
        System.out.println("What was your score on test Four?");
        float scoreFour = input.nextFloat();
        System.out.println("What was test five out of?");
        float testFive = input.nextFloat();
        System.out.println("What was your score on test five?");
        float scoreFive = input.nextFloat();
        //Calculate and print the test scores
        System.out.println("Test Scores for " + userName);
        float perOne = (scoreOne / testOne) * 100;
        System.out.println("Test 1: " + perOne + "%");
        float perTwo = (scoreTwo / testTwo) * 100;
        System.out.println("Test 2: " + perTwo + "%");
        float perThree = (scoreThree / testThree) * 100;
        System.out.println("Test 3: " + perThree + "%");
        float perFour = (scoreFour / testFour) * 100;
        System.out.println("Test 4: " + perFour + "%");
        float perFive = (scoreFive / testFive) * 100;
        System.out.println("Test 5: " + perFive + "%");
        //Calculate and print a average
        float averageScore = (perOne + perTwo + perThree + perFour + perFive)/5;
        System.out.println("Average: " + averageScore + "%");
    }
}
