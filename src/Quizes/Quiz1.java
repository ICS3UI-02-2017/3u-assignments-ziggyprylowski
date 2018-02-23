/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quizes;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author prylz2189
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Create a city
        City kw = new City();
        //Create the robot
        RobotSE ziggy;
        ziggy = new RobotSE(kw, 4, 0, Direction.EAST);
        //Create the staircase
        new Wall(kw, 4, 2, Direction.WEST);
        new Wall(kw, 4, 2, Direction.NORTH);
        new Wall(kw, 3, 3, Direction.WEST);
        new Wall(kw, 3, 3, Direction.NORTH);
        new Wall(kw, 2, 4, Direction.WEST);
        new Wall(kw, 2, 4, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 2, 5, Direction.NORTH);
        new Wall(kw, 3, 6, Direction.EAST);
        new Wall(kw, 3, 6, Direction.NORTH);
        new Wall(kw, 4, 7, Direction.EAST);
        new Wall(kw, 4, 7, Direction.NORTH);
        //Create the lights
        new Thing(kw, 4, 1);
        new Thing(kw, 3, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 1, 4);
        //Robot picks up the lights and moves them to the other side of the staircase
        ziggy.move();
        ziggy.pickThing();
        ziggy.turnLeft();
        ziggy.move();
        ziggy.turnRight();
        ziggy.move();
        ziggy.pickThing();
        ziggy.turnLeft();
        ziggy.move();
        ziggy.turnRight();
        ziggy.move();
        ziggy.pickThing();
        ziggy.turnLeft();
        ziggy.move();
        ziggy.turnRight();
        ziggy.move();
        ziggy.pickThing();
        ziggy.move();
        ziggy.putThing();
        ziggy.move();
        ziggy.turnRight();
        ziggy.move();
        ziggy.putThing();
        ziggy.turnLeft();
        ziggy.move();
        ziggy.turnRight();
        ziggy.move();
        ziggy.putThing();
        ziggy.turnLeft();
        ziggy.move();
        ziggy.turnRight();
        ziggy.move();
        ziggy.putThing();
        ziggy.turnLeft();
        
        
        
          
        }
}
 