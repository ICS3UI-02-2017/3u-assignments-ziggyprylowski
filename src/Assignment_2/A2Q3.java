/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author prylz2189
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City arena = new City();
        //Create a city
        RobotSE ziggy;
        ziggy = new RobotSE(arena, 12, 6, Direction.EAST);
//Create a robot named ziggy in arena

        do {
            ziggy.turnRight();
        } while (!ziggy.isFacingNorth());
        //Turn right until ziggy is facing north
        do {
            ziggy.move();
        } while (ziggy.getStreet() != 0);
        //move until ziggy is on street 0
        ziggy.turnLeft();
        //Turn left
        do {
            ziggy.move();
        } while (ziggy.getAvenue() != 0);
        //Move until ziggy is on avenue 0
    }
}
