/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author prylz2189
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City arena = new City();
//Create a city named arena
        RobotSE ziggy;
        //Create a new robot named ziggy
        ziggy = new RobotSE(arena, 1, 1, Direction.EAST);
        //Place ziggy in arena an 1,1 facing east
        new Thing(arena, 1, 2);
        new Thing(arena, 1, 3);
        new Thing(arena, 1, 4);
        new Thing(arena, 1, 5);
        new Thing(arena, 1, 6);
        new Thing(arena, 1, 7);
        new Thing(arena, 1, 8);
        new Thing(arena, 1, 9);
        new Thing(arena, 1, 10);
        new Thing(arena, 1, 11);
        //Create 10 things
        ziggy.move();
        while (ziggy.canPickThing()) {
            if (ziggy.countThingsInBackpack() < 7) {
                ziggy.pickThing();
                ziggy.move();
            }
            if (ziggy.countThingsInBackpack() >= 7) {
                ziggy.move();
            }
            //While Ziggy can pick something up and it has less than 7 things in
            //back pick up the object and while ziggy has 7 or more things in 
            //the backpack while it can pick an object it moves
        }
    }
}
