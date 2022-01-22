/**
 * Week3Program.java:
 * Move down the bug.
 *
 * @author Sishi Cheng
 */

import wheelsunh.users.*;

public class Week3Program {

    // -----------------------------------------------------------------
    /** main program creates a frame and smoothly move down the bug
     */
    public static void main(String[] args) {
        new Frame();

        //build bug1
        Bug bug1 = new Bug( 0, 100 );

        //build bug2
        Bug bug2 = new Bug( 100, bug1.getYLocation() );

        //build bug3
        Bug bug3 = new Bug( 200, bug1.getYLocation() );

        //build bug4
        Bug bug4 = new Bug( 300, bug1.getYLocation() );

        //build bug5
        Bug bug5 = new Bug( 400, bug1.getYLocation() );

        //build bug6
        Bug bug6 = new Bug( 500, bug1.getYLocation() );

        for( int i = 0; i < 90; i++ )
        {
            Utilities.sleep( 20 );
            bug1.moveDown( 5 );
            bug2.moveDown( 5 );
            bug3.moveDown( 5 );
            bug4.moveDown( 5 );
            bug5.moveDown( 5 );
            bug6.moveDown( 5 );
        }
    }
}
