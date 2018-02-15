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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
City arena = new City();
//Create a city for the robot
RobotSE robo1;
robo1 = new RobotSE(arena, 0, 0, Direction.SOUTH);
//Create a robot named robo1 in arena at 0,0 facing SOUTH
RobotSE robo2;
robo2 = new RobotSE(arena, 0, 1, Direction.SOUTH);
////Create a robot named robo2 in arena at 0,1 facing SOUTH
new Wall(arena, 0, 1, Direction.WEST);
new Wall(arena, 1, 1, Direction.WEST);
new Wall(arena, 1, 1, Direction.SOUTH);
//Create walls between the robots
robo2.move();
robo1.move();
robo2.turnLeft();
robo1.move();
robo2.move();
robo2.turnRight();
robo2.move();
robo1.turnLeft();
robo2.turnRight();
robo1.move();
robo2.move();
//Move the robots around the walls so they meet in the middle
    }
}
