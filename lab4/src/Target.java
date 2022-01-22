

// --------------- imports ------------------------------

import wheelsunh.users.*;

import java.awt.Color;

/**
 * Target.java:
 * <p>
 * Displays a simple archery target using multiple Wheels Shapes.
 * The entire target is built in a method, makeTarget.
 * <p>
 * makeTarget has position arguments.
 *
 * @author rdb and mlb
 */
public class Target extends ShapeGroup
{
    //---------------- instance variables ------------------------------
    // local "constant" variables define the locations of the inner
    //   circles relative to the level1 circle.
    protected final int level2X = 15, level2Y = 15;
    protected final int level3X = 25, level3Y = 25;
    protected final int level4X = 30, level4Y = 30;

    // local "constant" variables define the sizes of all circles
    protected final int level1Size = 80;
    protected final int level2Size = 50;
    protected final int level3Size = 30;
    protected final int level4Size = 20;

    // other local variables are used to references  Wheels objects
    // used to draw the target.
    protected Ellipse level1;
    protected Ellipse level2;
    protected Ellipse level3;
    protected Ellipse level4;
    // -----------------------------------------------------------------

    /**
     * Constructor for the TargetApp class.
     */
    public Target()
    {
        super();
        makeTarget( 0, 0 );
    }
    ////////////////////////////////////////////////////////////////////
    /**
     * 2 parameter constructor goes here:
     */
    // Write constructor with position parameters (2 ints)
    public Target( int x, int y )
    {
        super();
        makeTarget( x, y );
    }

    ////////////////////////////////////////////////////////////////////
    // -----------------------------------------------------------------

    // -----------------------------------------------------------------

    /**
     * move( int dx, int dy ).
     * move the location of the target by dx and dy
     * newx = oldx + dx
     * newy = oldy + dy
     * use Target's setLocation method to actually change the location
     *
     * @param dx int
     * @param dy int
     */
    public void move( int dx, int dy ) {
        /////////////////////////////////////////////////////////
        // move code here
        int x = super.getXLocation();
        int y = super.getYLocation();
        super.setLocation( x+dx, y+dy );

        ////////////////////////////////////////////////////////
    }

    // -----------------------------------------------------------------

    /**
     * makeTarget.
     * encapsulates all the Wheels components needed to draw a target.
     *
     * @param x int
     * @param y int
     */
    public void makeTarget( int x, int y ) {
        // create the level1 circle
        level1 = new Ellipse( x, y );
        level1.setSize( level1Size, level1Size );
        super.add( this.level1 );

        // create the next level4 circle
        level2 = new Ellipse( x + level2X, y + level2Y );
        level2.setSize( level2Size, level2Size );
        level2.setColor( Color.BLUE );
        super.add( this.level2 );

        // create the next level4 circle
        level3 = new Ellipse( x + level3X, y + level3Y );
        level3.setSize( level3Size, level3Size );
        level3.setColor( Color.CYAN );
        super.add( this.level3 );

        // create the level4 circle
        level4 = new Ellipse( x + level4X, y + level4Y );
        level4.setColor( Color.BLACK );
        level4.setSize( level4Size, level4Size );
        super.add( this.level4 );
    }

    // -----------------------------------------------------------------

    /**
     * main program just invokes the class constructor.
     *
     * @param args String
     */
    public static void main( String[] args ) {
        Frame f = new Frame();
        Target t1 = new Target();
        Utilities.sleep( 1000 );
        t1.setLocation( 100, 100 );
        Utilities.sleep( 1000 );
        t1.move( 10, 10 );
        ////////////////////////////////////////////////////////////////
        // Add much more Target creation code here
        //
//
//
        ////////////////////////////////////////////////////////////////
    }


} //End of Class TargetApp
