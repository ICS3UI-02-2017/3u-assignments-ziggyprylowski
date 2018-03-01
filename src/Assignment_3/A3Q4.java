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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City arena = new City();
        //Create a city
        RobotSE ziggy;
        ziggy = new RobotSE(arena, 3, 3, Direction.SOUTH);
//Create a robot named ziggy in arena 
        new Wall(arena, 1, 1, Direction.NORTH);
        new Wall(arena, 1, 1, Direction.WEST);
        new Wall(arena, 1, 2, Direction.EAST);
        new Wall(arena, 1, 2, Direction.NORTH);
        new Wall(arena, 2, 1, Direction.WEST);
        new Wall(arena, 2, 1, Direction.SOUTH);
        new Wall(arena, 2, 2, Direction.EAST);
        new Wall(arena, 2, 2, Direction.SOUTH);
        new Wall(arena, 1, 4, Direction.NORTH);
        new Wall(arena, 1, 4, Direction.WEST);
        new Wall(arena, 1, 5, Direction.EAST);
        new Wall(arena, 1, 5, Direction.NORTH);
        new Wall(arena, 2, 4, Direction.WEST);
        new Wall(arena, 2, 4, Direction.SOUTH);
        new Wall(arena, 2, 5, Direction.EAST);
        new Wall(arena, 2, 5, Direction.SOUTH);
        new Wall(arena, 4, 1, Direction.NORTH);
        new Wall(arena, 4, 1, Direction.WEST);
        new Wall(arena, 4, 2, Direction.EAST);
        new Wall(arena, 4, 2, Direction.NORTH);
        new Wall(arena, 5, 1, Direction.WEST);
        new Wall(arena, 5, 1, Direction.SOUTH);
        new Wall(arena, 5, 2, Direction.EAST);
        new Wall(arena, 5, 2, Direction.SOUTH);
        new Wall(arena, 4, 4, Direction.NORTH);
        new Wall(arena, 4, 4, Direction.WEST);
        new Wall(arena, 4, 5, Direction.EAST);
        new Wall(arena, 4, 5, Direction.NORTH);
        new Wall(arena, 5, 4, Direction.WEST);
        new Wall(arena, 5, 4, Direction.SOUTH);
        new Wall(arena, 5, 5, Direction.EAST);
        new Wall(arena, 5, 5, Direction.SOUTH);
        //Create the 4 blocks
        for (int g = 0; g < 4; g++) {
            ziggy.turnLeft();
            for (int i = 0; i < 4; i++) {
                ziggy.move(3);
                ziggy.turnLeft();
            }
        }
        //ziggy walks around the blocks
    }
}
