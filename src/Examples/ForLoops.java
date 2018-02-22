/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author prylz2189
 */
public class ForLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City();
        RobotSE karel;
        karel = new RobotSE(kw, 1, 1, Direction.EAST);
//New city and robot
        int numberOfMoves = 5;
//Counted while loop
        while (numberOfMoves > 0) {
            karel.move();
            numberOfMoves = numberOfMoves - 1;
        }
//If there are still moves to do
        karel.turnAround();
        numberOfMoves = 0;
        while (numberOfMoves < 5) {
            karel.move();
            numberOfMoves = numberOfMoves + 1;
            //Counting the other way
            karel.turnAround();
            for (int count = 0; count < 5; count++) {
                karel.move();
            }
            int x = 10;
            x = x + 5;
            x += 5;
            //Adds 5 to x
            x = x - 5;
            x -= 5;
            //Subtracts 5 from x
            x = x * 2;
            x *= 2;
            //Multiplies x by 2
            x = x / 4;
            x /= 4;
            //Divides x by 4
        }
    }
}
