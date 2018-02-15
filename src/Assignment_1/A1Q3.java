/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author prylz2189
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City arena = new City();
        //Create a city named arena
        RobotSE ziggy;
        ziggy = new RobotSE(arena, 3, 0, Direction.EAST);
        //Create a robot named ziggy in arena at 3,0 facing east
        new Thing(arena, 3, 1);
       //create a thing in arena at 3,2
        new Wall(arena, 3, 2, Direction.WEST);
        new Wall(arena, 3, 2, Direction.NORTH);
        new Wall(arena, 2, 3, Direction.WEST);
        new Wall(arena, 1, 3, Direction.EAST);
        new Wall(arena, 1, 3, Direction.WEST);
        new Wall(arena, 1, 3, Direction.NORTH);
        new Wall(arena, 2, 4, Direction.NORTH);
        new Wall(arena, 2, 4, Direction.EAST);
        new Wall(arena, 3, 4, Direction.EAST);
        //Creates a mountain of walls
        ziggy.move();
        ziggy.pickThing();
        //ziggy moves forward and picks up thing(flag)
        ziggy.turnLeft();
        ziggy.move();
        ziggy.turnRight();
        ziggy.move();
        ziggy.turnLeft();
        ziggy.move(2);
        ziggy.turnRight();
        ziggy.move();
        //ziggy goes to the top of the mountain
        ziggy.putThing();
        //ziggy puts down thing(flag)
        ziggy.move();
        ziggy.turnRight();
        ziggy.move();
        ziggy.turnLeft();
        ziggy.move();
        ziggy.turnRight();
        ziggy.move(2);
        ziggy.turnLeft();
        //ziggy moves to the bottom right side of the mountainn and faces East
        
    }
}
