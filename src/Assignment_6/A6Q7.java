/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_6;

/**
 *
 * @author prylz2189
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create an array with 999 spaces
        int listOfNums[] = new int[999];
        //Assign the 999 spaces with every number from two to one thousand
        for (int i = 2; i < 999; i++) {
            listOfNums[i] = i;
            //The array spot of any numbers that are the product of two numbers between two and one thousand are assigned the value of -1
        }
        for (int j = 2; j < 999; j++) {
            for (int y = 2; y < 999; y++) {
                int q = y * j;
                if (q >= 999) {
                    break;
                }
                listOfNums[q] = -1;
            }
        }
        //Print all spots in the array unless the value is -1
        for (int v = 0; v < 999; v++) {
            if (listOfNums[v] != -1 && listOfNums[v] != 0) {
                System.out.println(listOfNums[v]);
            }
        }
    }
}
