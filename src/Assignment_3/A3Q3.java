/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author prylz2189
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City arena = new City();
        //Create a city
        RobotSE ziggy = new RobotSE(arena, 1, 1, Direction.EAST, 20);
//Create a robot named ziggy in arena with 20 seeds in packpack
        for (int i = 0; i < 5; i++) {
            ziggy.putThing();
            ziggy.move();
        }
        ziggy.turnRight();
        ziggy.move();
        ziggy.turnRight();
        ziggy.move();
        for (int i = 0; i < 5; i++) {
            ziggy.putThing();
            ziggy.move();
        }
        ziggy.turnLeft();
        ziggy.move();
        ziggy.turnLeft();
        ziggy.move();
        for (int i = 0; i < 5; i++) {
            ziggy.putThing();
            ziggy.move();
        }
        ziggy.turnRight();
        ziggy.move();
        ziggy.turnRight();
        ziggy.move();
        for (int i = 0; i < 5; i++) {
            ziggy.putThing();
            ziggy.move();
        }
        ziggy.turnLeft();
        ziggy.move();
        ziggy.turnLeft();
        ziggy.move();
        //ziggy plants the seeds in a 5 x 4 field
    }
}
