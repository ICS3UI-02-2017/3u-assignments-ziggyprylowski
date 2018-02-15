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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 City arena = new City();
 //Create a city named arena
 RobotSE ziggy;
 //Create a robot named ziggy
 ziggy = new RobotSE(arena, 1, 2, Direction.SOUTH);
 //Put ziggy in arena at 1,2 facing south
 new Wall(arena, 1, 2, Direction.SOUTH);
 new Wall(arena, 1, 2, Direction.EAST);
 new Wall(arena, 1, 2, Direction.NORTH);
 new Wall(arena, 1, 1, Direction.NORTH);
 new Wall(arena, 1, 1, Direction.WEST);
 new Wall(arena, 2, 1, Direction.WEST);
 new Wall(arena, 2, 1, Direction.SOUTH);
 //Create walls around ziggy (porch)
 new Thing(arena, 2, 2);
 //Creats a thing in arena(newspaper) at 2,2
 ziggy.turnRight();
 ziggy.move();
 ziggy.turnLeft();
 ziggy.move();
 ziggy.turnLeft();
 ziggy.move();
 //Guide ziggy to the thing
 ziggy.pickThing();
//ziggy picks up thing
 ziggy.turnAround();
 ziggy.move();
 ziggy.turnRight();
 ziggy.move();
 ziggy.turnRight();
 ziggy.move();
 ziggy.turnRight();
 //ziggy returns to his original position and faces his original way
    }
}
