/**
 * Tree.java:
 * Use class to represent a tree in four seasons.
 *
 * @author Sishi Cheng
 */

import wheelsunh.users.Frame;
import wheelsunh.users.Utilities;

import java.awt.*;

/**
 *Define a new class called Week5Homework
 */

public class Week5Homework {

    /** main program creates a frame and test the bug, tree and house class
     */
    public static void main(String[] args) {
        new Frame();//Create a frame

        //create a bug use interface based polymorphism
        Seasonal bug = new Bug();
        bug.spring();
        Utilities.sleep( 1000 );
        bug.summer();
        Utilities.sleep( 1000 );
        bug.fall();
        Utilities.sleep( 1000 );
        bug.winter();
        Utilities.sleep( 1000 );

        //create a house use interface based polymorphism
        Seasonal house = new House( 400, 300 , Color.yellow );
        house.spring();
        Utilities.sleep( 1000 );
        house.summer();
        Utilities.sleep( 1000 );
        house.fall();
        Utilities.sleep( 1000 );
        house.winter();
        Utilities.sleep( 1000 );

        //create a tree use interface based polymorphism
        Seasonal tree = new Tree();
        tree.spring();
        Utilities.sleep( 1000 );
        tree.summer();
        Utilities.sleep( 1000 );
        tree.fall();
        Utilities.sleep( 1000 );
        tree.winter();
    }
}
