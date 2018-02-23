/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author prylz2189
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City arena = new City();
        //Create a city
        RobotSE ziggy;
        ziggy = new RobotSE(arena, 0, 2, Direction.WEST);
//Create a robot named ziggy in arena  
        new Wall(arena, 1, 1, Direction.NORTH);
        new Wall(arena, 1, 1, Direction.WEST);
        new Wall(arena, 1, 2, Direction.EAST);
        new Wall(arena, 1, 2, Direction.NORTH);
        new Wall(arena, 2, 1, Direction.SOUTH);
        new Wall(arena, 2, 1, Direction.WEST);
        new Wall(arena, 2, 2, Direction.SOUTH);
        new Wall(arena, 2, 2, Direction.EAST);
        //Create the walls

        for (int i = 0; i < 8; i++) {
            ziggy.move(2);
            ziggy.turnLeft();
            ziggy.move();
//Move the robot around the square twice
        }
    }
}
