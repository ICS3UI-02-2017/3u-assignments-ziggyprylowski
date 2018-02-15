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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
City arena = new City();
//Create a city named arena
RobotSE maria;
RobotSE karel;
maria = new RobotSE(arena, 0, 1, Direction.WEST);
karel = new RobotSE(arena, 3, 3, Direction.EAST);
//Create a robot named maria and karel in arena
maria.setLabel("M");
karel.setLabel("K");
//Label karel with a k and maria with a m
new Wall(arena, 2, 3, Direction.NORTH);
new Wall(arena, 2, 3, Direction.EAST);
new Wall(arena, 2, 3, Direction.WEST);
new Wall(arena, 3, 3, Direction.SOUTH);
new Wall(arena, 3, 3, Direction.EAST);
//Create walls around karel
new Thing(arena, 0, 0);
new Thing(arena, 1, 0);
new Thing(arena, 1, 1);
new Thing(arena, 1, 2);
new Thing(arena, 2, 2);
//Place things down on the ground
maria.move();
maria.pickThing();
karel.turnAround();
maria.turnLeft();
karel.move();
karel.turnRight();
maria.move();
maria.pickThing();
karel.move();
karel.pickThing();
maria.turnLeft();
karel.move();
karel.pickThing();
maria.move();
maria.pickThing();
karel.turnLeft();
//maria and karel move and pick up the things
    }
}
