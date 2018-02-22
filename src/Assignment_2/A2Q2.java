/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author prylz2189
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City arena = new City();
        RobotSE ziggy;
        ziggy = new RobotSE(arena, 4, 0, Direction.EAST);
        new Thing(arena, 4, 8);
//Create a robot named ziggy in arena at 4,0 facing east
        new Wall(arena, 4, 0, Direction.SOUTH);
        new Wall(arena, 4, 0, Direction.EAST);
        new Wall(arena, 4, 1, Direction.SOUTH);
        new Wall(arena, 4, 1, Direction.EAST);
        new Wall(arena, 4, 2, Direction.SOUTH);
        new Wall(arena, 4, 3, Direction.SOUTH);
        new Wall(arena, 4, 3, Direction.EAST);
        new Wall(arena, 4, 4, Direction.SOUTH);
        new Wall(arena, 4, 5, Direction.SOUTH);
        new Wall(arena, 4, 6, Direction.SOUTH);
        new Wall(arena, 4, 6, Direction.EAST);
        new Wall(arena, 4, 7, Direction.SOUTH);
        new Wall(arena, 4, 8, Direction.SOUTH);
//Place walls (hurdles)
        do {
            if (ziggy.frontIsClear()) {
                ziggy.move();
            } else {
                ziggy.turnLeft();
                ziggy.move();
                ziggy.turnRight();
                ziggy.move();
                ziggy.turnRight();
                ziggy.move();
                ziggy.turnLeft();
            }
        } while (!ziggy.canPickThing());
//if ziggy cannot pick up a thing he looks forward. If the front is clear he 
//moves forward, if there is a hurdle he jumps over it and continues.


    }
}
