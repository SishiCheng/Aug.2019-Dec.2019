/**
 * Bug.java:
 * Use class to represent a bug.
 *
 * @author Sishi Cheng
 */

import wheelsunh.users.*;
import java.awt.Color;

/**
 *Define a new class called week4Homework
 */

public class week4Homework
{

    /** main program creates a frame and test the parents and children classes
     */
    public static void main(String[] args) {
        Frame f = new Frame();//create a frame
        Bug bug1 = new Bug();//create bug1

        // creat a polymorphism named bug2
        Bug bug2 = new CrawlingBug( 200, 200 );

        //creat a polymorphism named bug3
        Bug bug3 = new RainbowBug( 400, 300 );
        bug3.setColor(Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE);
        for ( int i = 0; i< 30; i++ ){
            Utilities.sleep( 100 );
            bug2.moveDown( 5);
        }
    }
}
