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
public class Challenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City arena = new City();
        //Create a city
        RobotSE karel;
        RobotSE tina;
        karel = new RobotSE(arena, 0, 0, Direction.EAST);
        tina = new RobotSE(arena, 0, 0, Direction.EAST);
        new Wall(arena, 0, 0, Direction.WEST);
        new Wall(arena, 1, 0, Direction.WEST);
        new Wall(arena, 2, 0, Direction.WEST);
        new Wall(arena, 3, 0, Direction.WEST);
        new Wall(arena, 4, 0, Direction.WEST);
        new Wall(arena, 5, 0, Direction.WEST);
        new Wall(arena, 6, 0, Direction.WEST);
        new Wall(arena, 7, 0, Direction.WEST);
        new Wall(arena, 8, 0, Direction.WEST);
        new Wall(arena, 9, 0, Direction.WEST);
        new Wall(arena, 0, 1, Direction.EAST);
        new Wall(arena, 1, 1, Direction.EAST);
        new Wall(arena, 2, 1, Direction.EAST);
        new Wall(arena, 3, 1, Direction.EAST);
        new Wall(arena, 4, 1, Direction.EAST);
        new Wall(arena, 5, 1, Direction.EAST);
        new Wall(arena, 6, 1, Direction.EAST);
        new Wall(arena, 7, 1, Direction.EAST);
        new Wall(arena, 8, 1, Direction.EAST);
        new Wall(arena, 9, 1, Direction.EAST);
        //
    }
}
