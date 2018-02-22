/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author prylz2189
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City arena = new City();
//Create a city named arena
        RobotSE ziggy;
        //Create a new robot named ziggy
        ziggy = new RobotSE(arena, 0, 1, Direction.EAST);
        //Place ziggy in arena an 0,1 facing east
        new Wall(arena, 1, 1, Direction.NORTH);
        new Wall(arena, 1, 1, Direction.SOUTH);
        new Wall(arena, 1, 1, Direction.EAST);
        new Wall(arena, 1, 1, Direction.WEST);
        new Wall(arena, 4, 1, Direction.NORTH);
        new Wall(arena, 4, 1, Direction.SOUTH);
        new Wall(arena, 4, 1, Direction.EAST);
        new Wall(arena, 4, 1, Direction.WEST);
        new Wall(arena, 1, 4, Direction.NORTH);
        new Wall(arena, 1, 4, Direction.SOUTH);
        new Wall(arena, 1, 4, Direction.EAST);
        new Wall(arena, 1, 4, Direction.WEST);
        new Wall(arena, 4, 4, Direction.NORTH);
        new Wall(arena, 4, 4, Direction.SOUTH);
        new Wall(arena, 4, 4, Direction.EAST);
        new Wall(arena, 4, 4, Direction.WEST);
        new Wall(arena, 2, 3, Direction.NORTH);
        new Wall(arena, 2, 3, Direction.EAST);
        new Wall(arena, 3, 3, Direction.EAST);
        new Wall(arena, 3, 3, Direction.SOUTH);
        new Wall(arena, 2, 2, Direction.NORTH);
        new Wall(arena, 2, 2, Direction.WEST);
        new Wall(arena, 3, 2, Direction.WEST);
        new Wall(arena, 3, 2, Direction.SOUTH);
        //Create the castle out of walls
        while (true) {
            ziggy.move();
            ziggy.turnRight();
            ziggy.move();
            ziggy.turnLeft();
            ziggy.move();
            ziggy.turnLeft();
            ziggy.move();
            ziggy.turnRight();
            ziggy.move(2);
            ziggy.turnRight();
            ziggy.move();
//Walks around castle
        }
    }
}
