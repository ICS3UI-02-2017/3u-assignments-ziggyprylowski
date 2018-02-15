/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/**
 *Learning how to use a robot
 * @author Ziggy Prylowski
 */
public class RobotExamples {
    private static int i;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a City for the Robot
        City kw = new City();
        //Put a Robot in kw
        RobotSE marcel;
        //Sets where marcel starts and is looking
        marcel = new RobotSE(kw, 2, 3, Direction.EAST);
    //            new Wall( kw, 2, 5, Direction.WEST);
        //Moves marce; one spot forward
        marcel.move(5);
        marcel.turnAround();
        marcel.setLabel("ZIGGY");
        marcel.setColor(Color.PINK);
        marcel.move(4);
        new Thing(kw, 2, 4);
        marcel.pickThing();
        marcel.move(5);
        marcel.turnAround();
        marcel.move(10);
        marcel.putThing();marcel.move(2);
    }
}