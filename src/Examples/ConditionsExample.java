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

/**
 *
 * @author prylz2189
 */
public class ConditionsExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City();
                //Create a city for the robot
RobotSE karel = new RobotSE(kw, 2, 1, Direction.EAST);
                //New robot in kw at 2, 1, facing east
new Wall(kw, 2, 5, Direction.EAST);
//Create a wall at 2,5 facing east
new Thing(kw, 2, 4);
new Thing(kw, 2, 2);
//Create 2 new things
while(karel.frontIsClear()){
karel.move();
while(karel.canPickThing())
{
    karel.pickThing();
}
}
//Move while front is clear and pick up anything on his path
karel.turnRight();
//karel turna right when front is not clear
if(karel.countThingsInBackpack() == 1){
karel.move();
}else if(karel.countThingsInBackpack() == 2){
        karel.move(2);
}else {karel.turnAround();}
}
}
