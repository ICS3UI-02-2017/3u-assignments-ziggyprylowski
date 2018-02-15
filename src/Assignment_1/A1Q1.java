/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author prylz2189
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
City arena = new City();
//Cerate a city for the robot
RobotSE ziggy;
//Create a robot named ziggy
ziggy = new RobotSE(arena, 0, 2, Direction.WEST);
//Put robot in the city at 0,1 facing west
new Wall(arena, 1, 1, Direction.NORTH);
new Wall(arena, 1, 2, Direction.NORTH);
//Put 2 walls facing up 
new Wall(arena, 2, 1, Direction.SOUTH);
new Wall(arena, 2, 2, Direction.SOUTH);
//Put 2 walls facing down
new Wall(arena, 1, 2, Direction.EAST);
new Wall(arena, 2, 2, Direction.EAST);
//Put 2 walls facing right
new Wall(arena, 2, 1, Direction.WEST);
new Wall(arena, 1, 1, Direction.WEST);
//Put 2 walls facing left
ziggy.move(2);
ziggy.turnLeft();
ziggy.move(3);
ziggy.turnLeft();
ziggy.move(3);
ziggy.turnLeft();
ziggy.move(3);
ziggy.turnLeft();
ziggy.move();
//Robot does one counter clockwise circle around the walls and returns to original position
    }
}
