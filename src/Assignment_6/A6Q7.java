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
        int listOfNums[] = new int[999];
        for (int i = 2; i < 999; i++) {
            listOfNums[i] = i;
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
        for (int v = 0; v < 999; v++) {
            if (listOfNums[v] != -1)
            {
                System.out.println(listOfNums[v]);
            }
        }
    }
}
