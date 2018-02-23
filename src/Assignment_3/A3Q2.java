/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author prylz2189
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City arena = new City();
        //Create a city
        RobotSE ziggy;
        ziggy = new RobotSE(arena, 2, 1, Direction.EAST);
//Create a robot named ziggy in arena 
        for (int i = 0; i < 10; i++) {
new Thing(arena, 2, 2);
        }
        ziggy.move();
        for (int i = 0; i < 10; i++) {
            ziggy.pickThing();
            ziggy.move();
            ziggy.putThing();
            ziggy.turnAround();
            ziggy.move();
            ziggy.turnAround();
        }
    }
}
